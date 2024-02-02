package com.command.note;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class ProductServiceController {

    @CrossOrigin(origins = "http://localhost:8000")
    @PostMapping("/command")
    public String processCommand(@RequestBody String command) {
        // Process the command (you can add your logic here)
        return "Command received: " + command;
    }
}