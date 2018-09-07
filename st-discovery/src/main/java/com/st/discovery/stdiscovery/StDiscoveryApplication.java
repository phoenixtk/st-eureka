package com.st.discovery.stdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(StDiscoveryApplication.class, args);
    }
}
