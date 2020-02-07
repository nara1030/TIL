package com.eom.openapi.util.searchConfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "naver.openapi")
public class SearchProperties {
    private String uri;
    private String clientId;
    private String clientSecret;
}
