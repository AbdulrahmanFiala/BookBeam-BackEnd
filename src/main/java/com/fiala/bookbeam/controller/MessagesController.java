package com.fiala.bookbeam.controller;

import com.fiala.bookbeam.entity.Message;
import com.fiala.bookbeam.service.BookService;
import com.fiala.bookbeam.service.MessagesService;
import com.fiala.bookbeam.utils.ExtractJWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/messages")
public class MessagesController {
    private MessagesService messagesService;

    @Autowired
    public MessagesController(MessagesService messagesService) {
        this.messagesService = messagesService;
    }

    @PostMapping("/secure/add/message")
    public void addMessage(@RequestHeader(value = "Authorization") String token, @RequestBody Message messageRequest)
            throws Exception{
        String userEmail = ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
        messagesService.postMessage(messageRequest, userEmail);
    }

}
