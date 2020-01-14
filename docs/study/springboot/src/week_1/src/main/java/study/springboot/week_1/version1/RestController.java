package study.springboot.week_1.version1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

@RestControllerAdvice
@RequestMapping("/searchAPI")
public class RestController {
    String blogUrl = "https://openapi.naver.com/v1/search/blog.json";
    String clientId = "coR9EXPq79pgizJNLSb5";
    String clientSecret = "iZrTY3crzD";
    String searchText = "모스크바";

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HttpHeaders httpHeaders;

    @GetMapping("/blog")
    public String getBlogData() {
        String apiURL = blogUrl + "?query=" + searchText;
        httpHeaders.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        httpHeaders.add("X-Naver-Client-Id", clientId);
        httpHeaders.add("X-Naver-Client-Secret", clientSecret);

        ResponseEntity<String> stringResponseEntity = restTemplate.exchange(apiURL, HttpMethod.GET, new HttpEntity<String>(httpHeaders), String.class);
        return  stringResponseEntity.toString();
    }
}
