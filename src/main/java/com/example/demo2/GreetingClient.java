package com.example.demo2;
import reactor.core.publisher.Mono;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Component
public class GreetingClient {

    private final WebClient client;

    public GreetingClient() {
        this.client = WebClient.create("http://localhost:8081");
    }

    public Mono<Map> getJob(String name) {
        return this.client.get()
                .uri(uriBuilder ->
                        uriBuilder.path("/info-service/"+name)
                                .build()
                )
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Map.class);
    }

}