package org.sails.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Nodirbek on 13.02.2016. project
 */
@Component
public class MainProperties {

    @Value("${name}")
    private String name;

    @Value("${lastName}")
    private String lastName;

    @Value("${project.version}")
    private String projectVersion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVerion) {
        this.projectVersion = projectVerion;
    }
}
