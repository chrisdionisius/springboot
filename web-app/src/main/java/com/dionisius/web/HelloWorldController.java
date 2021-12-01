package com.dionisius.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<HelloWorld> getHelloWorld(){
        return ResponseEntity.ok(new HelloWorld());
    }

}
