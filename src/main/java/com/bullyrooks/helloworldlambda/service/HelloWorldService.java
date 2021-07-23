package com.bullyrooks.helloworldlambda.service;

import com.bullyrooks.helloworldlambda.service.vo.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    public HelloWorld helloWorld(String name) {
        return HelloWorld.builder()
                .response("Hello, " + name)
                .build();
    }
}
