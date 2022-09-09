package com.siamchamnankit.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siamchamnankit.demo.service.CreditApprovalService;

@RestController
public class CrediteController {
    @Autowired
    CreditApprovalService creditApprovalService;

    @PostMapping("/api/v1/credit/request/{requestAmount}")
    public boolean creditRequest(@PathVariable BigDecimal requestAmount) {
        return creditApprovalService.request(requestAmount);
    }
}
