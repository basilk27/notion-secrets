package com.mbsystems.notionsecrets;

import com.mbsystems.notionsecrets.config.NotionConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(NotionConfigProperties.class)
public class NotionSecretsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotionSecretsApplication.class, args);
    }

}
