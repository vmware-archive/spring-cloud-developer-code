package io.pivotal.pal.tracker.restsupport;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;

import java.time.Duration;

@Configuration
public class RestConfig {

    @Bean
    public RestOperations restOperations(RestOperationConfigProperties properties) {
        return new RestTemplateBuilder()
                .setReadTimeout(Duration.ofMillis(properties.getReadTimeoutMs()))
                .setConnectTimeout(Duration.ofMillis(properties.getConnectTimeoutMs()))
                .build();
    }

}
