package study.springboot.week_1.version2;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableConfigurationProperties(RestConfig.class)
public class BeanResister {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public HttpHeaders getHttpHeaders() {
        return new HttpHeaders();
    }

    @Bean
    public RestConfig getRestConfig() {
        RestConfig restConfig = new RestConfig();
        System.out.println("URL 확인1: " +  restConfig.getBlogUrl() );
        return restConfig;
    }
}
