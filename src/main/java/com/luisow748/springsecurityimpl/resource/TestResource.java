package com.luisow748.springsecurityimpl.resource;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestResource {
    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Ok!!");
    }
}
