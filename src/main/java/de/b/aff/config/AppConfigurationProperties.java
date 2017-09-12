package de.b.aff.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix="user-data") //root element from our yml file

// The class annotated with @SpringBootApplication is also annotated with
// @EnableConfigurationProperties(AppConfigurationProperties.class)
// If it's not the case we would have to annotate this class with @Configuration or any other annotation
// which is based on @Component
public class AppConfigurationProperties {
    private String name;
    private String surname;
    private List<String> possessions = new ArrayList<String>();

    public String getName() {
        return name;
    }

    //setters are required, getters are not
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<String> getPossessions() {
        return possessions;
    }

    public void setPossessions(List<String> possessions) {
        this.possessions = possessions;
    }

    @PostConstruct
    public void customManipulation() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(possessions);
    }
}
