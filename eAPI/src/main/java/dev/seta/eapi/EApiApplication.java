package dev.seta.eapi;

import dev.seta.eapi.security.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class EApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EApiApplication.class, args);
    }

}
