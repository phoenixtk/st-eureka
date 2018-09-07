package com.st.server.stserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StServerApplication.class, args);
    }
}
