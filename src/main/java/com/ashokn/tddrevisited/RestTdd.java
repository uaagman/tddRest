package com.ashokn.tddrevisited;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTdd {

    class Message {
        private String message;

        public Message(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    @GetMapping("/greet/{message}")
    public Message hello(@PathVariable("message") String message){
        StringBuilder sb = new StringBuilder("Hello! ");
        sb.append(message);
        return new Message(sb.toString());
    }

    public String testFxn(){
        return "Hi there";
    }
}
