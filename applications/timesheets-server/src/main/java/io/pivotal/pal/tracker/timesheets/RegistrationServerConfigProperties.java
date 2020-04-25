package io.pivotal.pal.tracker.timesheets;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "registration.server")
public class RegistrationServerConfigProperties implements RegistrationServerConfig{
    private String endpoint;

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
