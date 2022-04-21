package com.example.demo2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

import java.util.Map;

@Component
public class GreetingHandler {

    @Autowired
    private ApplicationContext context;
    public Mono<ServerResponse> hello(ServerRequest request) {



        GreetingClient greetingClient = context.getBean(GreetingClient.class);
        Mono<Map> resultInfo = greetingClient.getJob(request.pathVariable("name"));
        Mono<Greeting> data = resultInfo.map(x -> new Greeting(request.pathVariable("name"), (String) x.get("job")));

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(data, Greeting.class);
    }
}