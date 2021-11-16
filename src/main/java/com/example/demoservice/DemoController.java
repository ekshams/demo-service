package com.example.demoservice;

import com.example.demoservice.config.DemoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class DemoController {

    @Autowired
    private final DemoProperties demoProperties;

    public DemoController(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    @GetMapping("/")
    Mono<String> getRoot() {
        return Mono.just(demoProperties.message());
//        return Mono.just("demoProperties.message()");
    }
}
