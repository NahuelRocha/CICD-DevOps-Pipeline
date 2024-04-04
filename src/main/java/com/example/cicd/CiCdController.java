package com.example.cicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiCdController {

    @GetMapping("/hola")
    public ResponseEntity<String> getHello(){
        return ResponseEntity.ok("Hello my friend");
    }
}
