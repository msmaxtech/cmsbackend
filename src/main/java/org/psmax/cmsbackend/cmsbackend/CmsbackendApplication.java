package org.psmax.cmsbackend.cmsbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@Configuration
@ComponentScan("org.psmax.cmsbackend")
@EntityScan("org.psmax.cmsbackend.Entity")
@EnableJpaRepositories("org.psmax.cmsbackend.Repository")
@SpringBootApplication()
public class CmsbackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsbackendApplication.class, args);
    }
}
