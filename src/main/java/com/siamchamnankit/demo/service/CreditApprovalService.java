package com.siamchamnankit.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.siamchamnankit.demo.logic.CreditCalculator;

@Service
public class CreditApprovalService {
    public boolean request(BigDecimal requestAmount) {
        // getLimit
        BigDecimal creditLimit = new BigDecimal("100000");

        // getAvailableBalance
        BigDecimal creditAvailable = new BigDecimal("50000");

        // approveCredit
        CreditCalculator creditCalculator = new CreditCalculator();
        return creditCalculator.checkApprove(creditLimit, creditAvailable, requestAmount);
    }

}
