package com.siamchamnankit.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrediteController {
    @PostMapping("/api/v1/credit/request")
    public boolean creditRequest() {
        return true;
    }
}
