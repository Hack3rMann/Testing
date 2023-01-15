package com.backend.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/messaging")
public class MessagingRestService {
    @GetMapping(
            path = "/message",
            params = {"name"})
    public Message getMessage(
            @RequestParam final String name) {

        final Message message = new Message();
        message.setText("Hello " + name);
        return message;

    }
}
