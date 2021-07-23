package com.bullyrooks.helloworldlambda;

import com.bullyrooks.helloworldlambda.function.HelloWorldAPIFunction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloworldLambdaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloworldLambdaApplication.class, args);
    }

    @Bean
    HelloWorldAPIFunction apiFunction() {
        return new HelloWorldAPIFunction();
    }
}
