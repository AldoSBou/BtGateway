package org.bootcamp.bootcampgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

@EnableDiscoveryClient
@SpringBootApplication
public class BootcampGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootcampGatewayApplication.class, args);
    }

}
