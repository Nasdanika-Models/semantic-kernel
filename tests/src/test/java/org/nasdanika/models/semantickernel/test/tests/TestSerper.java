package org.nasdanika.models.semantickernel.test.tests;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.junit.jupiter.api.Test;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;


public class TestSerper {
	
	@Test
	public void testSerperReact() {
        String apiKey = System.getenv("SERPER_KEY");
        String query = "What is a kernel function in semantic kernel Java site:javadoc.io/doc/com.microsoft.semantic-kernel OR site:learn.microsoft.com/en-us/semantic-kernel OR site:github.com/microsoft/semantic-kernel-java";

        String url = "/search" +
            "?api_key=" + apiKey +
            "&engine=google" +
            "&q=" + encode(query) +
            "&google_domain=google.com" +
            "&gl=us" +
            "&hl=en";
//        +
//            "&location=Austin,+Texas,+United+States";

        Flux<JSONObject> result = HttpClient.create()
            .baseUrl("https://serpapi.com")
            .get()
            .uri(url)
            .responseSingle((res, content) -> content.asString())
            .map(JSONObject::new)
            .flatMapMany(searchResult -> {
            	JSONArray organicResults = searchResult.getJSONArray("organic_results");
            	List<Mono<JSONObject>> fullResults = new ArrayList<>();
            	for (int i = 0; i < organicResults.length(); ++i) {
            		JSONObject pageResult = organicResults.getJSONObject(i);
            		String pageUrl = pageResult.getString("link");
            		Mono<JSONObject> fRes = HttpClient
            			.create()
            			.get()
            			.uri(pageUrl)
            			.responseSingle((res, content) -> content.asString())
            			.map(rStr -> {
            				pageResult.put("content", rStr);
            				return pageResult; 
            			});
            		fullResults.add(fRes);
            	}
            	
            	return Flux.merge(fullResults);
            });

        List<JSONObject> responses = result.collectList().block();
        for (JSONObject resp: responses) {
        	System.out.println("===");
            System.out.println(resp.toString(2));
        }        
    }

    private static String encode(String value) {
        return java.net.URLEncoder.encode(value, java.nio.charset.StandardCharsets.UTF_8);
    }
    
    @Test
    public void testHtmlToMarkdown() {
    	String html = "<h1>Hello</h1><p>This is <strong>bold</strong>.</p>";
    	String cleanedHtml = Jsoup.parse(html).body().html(); // optional cleanup
    	String markdown = FlexmarkHtmlConverter.builder().build().convert(cleanedHtml);
    	System.out.println(markdown);
    	
    }

}
