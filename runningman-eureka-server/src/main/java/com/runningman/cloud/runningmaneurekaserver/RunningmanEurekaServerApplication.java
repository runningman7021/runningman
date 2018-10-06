package com.runningman.cloud.runningmaneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RunningmanEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunningmanEurekaServerApplication.class, args);
    }
}
