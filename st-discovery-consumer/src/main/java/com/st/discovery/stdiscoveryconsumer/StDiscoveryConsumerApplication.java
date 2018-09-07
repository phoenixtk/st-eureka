package com.st.discovery.stdiscoveryconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StDiscoveryConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StDiscoveryConsumerApplication.class, args);
    }
}
