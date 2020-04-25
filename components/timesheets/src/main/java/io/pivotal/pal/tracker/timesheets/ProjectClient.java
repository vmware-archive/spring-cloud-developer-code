package io.pivotal.pal.tracker.timesheets;

import org.springframework.web.client.RestOperations;

public class ProjectClient {

    private final RestOperations restOperations;
    private final RegistrationServerConfig registrationServerConfig;

    public ProjectClient(RestOperations restOperations, RegistrationServerConfig registrationServerConfig) {
        this.restOperations = restOperations;
        this.registrationServerConfig = registrationServerConfig;
    }

    public ProjectInfo getProject(long projectId) {
        return restOperations.getForObject(registrationServerConfig.getEndpoint()
                + "/projects/" + projectId, ProjectInfo.class);
    }

}
