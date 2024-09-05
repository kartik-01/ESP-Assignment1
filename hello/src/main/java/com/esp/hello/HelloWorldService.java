package com.esp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloWorldService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${hello.service.url}")
    private String helloServiceUrl;

    @Value("${world.service.url}")
    private String worldServiceUrl;

    public String getHelloWorld() {
        String helloResponse = restTemplate.getForObject(helloServiceUrl, String.class);
        String worldResponse = restTemplate.getForObject(worldServiceUrl, String.class);
        return helloResponse + " " + worldResponse;
    }
}