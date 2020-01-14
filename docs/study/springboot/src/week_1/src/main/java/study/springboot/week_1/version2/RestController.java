package study.springboot.week_1.version2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

@RestControllerAdvice
@RequestMapping("/searchAPI")
public class RestController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    HttpHeaders httpHeaders;
    @Autowired
    RestConfig restConfig;

    @GetMapping("/blog")
    public String getBlogData() {
        System.out.println("URL 확인2: " +  restConfig.getBlogUrl() );

        String apiURL = restConfig.getBlogUrl() + "?query=" + "샌프란시스코였으면ㅋㅋ";
        httpHeaders.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        httpHeaders.add("X-Naver-Client-Id", restConfig.getClientId());
        httpHeaders.add("X-Naver-Client-Secret", restConfig.getClientSecret());

        ResponseEntity<String> stringResponseEntity = restTemplate.exchange(apiURL, HttpMethod.GET, new HttpEntity<String>(httpHeaders), String.class);
        return stringResponseEntity.toString();
    }
}
