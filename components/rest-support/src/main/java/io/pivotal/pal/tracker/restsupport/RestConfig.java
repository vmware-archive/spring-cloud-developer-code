package io.pivotal.pal.tracker.restsupport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class RestConfig {

    @Bean
    public RestOperations restOperations() {
        return new RestTemplate();
    }

}
