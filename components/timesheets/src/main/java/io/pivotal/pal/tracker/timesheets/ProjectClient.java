package io.pivotal.pal.tracker.timesheets;

import org.springframework.web.client.RestOperations;

public class ProjectClient {

    private final RestOperations restOperations;
    private final RegistrationServerConfig endpointConfig;

    public ProjectClient(RestOperations restOperations,
                         RegistrationServerConfig endpointConfig) {
        this.restOperations = restOperations;
        this.endpointConfig = endpointConfig;
    }

    public ProjectInfo getProject(long projectId) {
        return restOperations.getForObject(endpointConfig.getEndpoint()
                + "/projects/" + projectId, ProjectInfo.class);
    }
}
