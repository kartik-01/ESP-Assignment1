package com.esp.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {
    @GetMapping ("/world")
    public String world() {
        return "World";
    }
}
