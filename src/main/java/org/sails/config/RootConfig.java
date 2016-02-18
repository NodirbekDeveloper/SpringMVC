package org.sails.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by Nodirbek on 12.02.2016. project
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:main.properties"),
        @PropertySource("classpath:db.properties")
})
@ComponentScan(
        basePackages = {
                "org.sails.service",
                "org.sails.properties"})
public class RootConfig {

    @Bean
    PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
