package study.springboot.week_1.version2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "naver.openapi")
@PropertySource("classpath:application.properties")
public class RestConfig {
    // @Value("${blogUrl}")
    private String blogUrl;

    // @Value("${clientId}")
    private String clientId;

    // @Value("${clientSecret}")
    private String clientSecret;

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl;
    }

    public String getBlogUrl() {
        return blogUrl;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getClientSecret() {
        return clientSecret;
    }

}
