package io.pivotal.pal.tracker.timesheets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestOperations;

import java.util.TimeZone;

@EnableConfigurationProperties(RegistrationServerConfigProperties.class)
@SpringBootApplication
@ComponentScan({"io.pivotal.pal.tracker.timesheets", "io.pivotal.pal.tracker.restsupport"})
public class TimesheetsApp {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SpringApplication.run(TimesheetsApp.class, args);
    }

    @Bean
    ProjectClient projectClient(
            RestOperations restOperations,
            RegistrationServerConfigProperties endpointConfig
    ) {
        return new ProjectClient(restOperations, endpointConfig);
    }
}
