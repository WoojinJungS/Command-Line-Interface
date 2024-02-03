package com.command.note;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class InputController {

    @PostMapping("/command")
    public String processCommand(@RequestBody String command) {
        // Process the command (you can add your logic here)
        return "Command received: " + command;
    }
}