package com.eom.openapi.util.httpConfig;

import com.eom.openapi.util.searchConfig.SearchProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

@Configuration
@EnableConfigurationProperties(SearchProperties.class)
public class RestTemplateConfig {

    // 1. RestTemplate을 별도의 Bean으로 정의
    // ∵ RestTemplate은 기본적으로 Connection Pool을 사용하지 않으므로 매 요청마다 handshake 수행
    // ∴ 중복 코드 발생(분리)
    // 2. @ConditionalMissingBean
    // Bean이 없는 경우 Properties를 통해 등록하는 방법
    @Bean
    public RestTemplate getCustomRestTemplate() {
        // TODO: 설정 변경
        return new RestTemplate();
    }

    @Bean
    @ConditionalOnMissingBean
    public HttpHeaders getSearchHttpHeaders(SearchProperties searchProperties) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        httpHeaders.add("X-Naver-Client-Id", searchProperties.getClientId());
        httpHeaders.add("X-Naver-Client-Secret", searchProperties.getClientSecret());

        return httpHeaders;
    }

    @Bean
    @ConditionalOnMissingBean
    public String getUri(SearchProperties searchProperties) {
        return searchProperties.getUri();
    }
}
