package com.siamchamnankit.demo.logic;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class CreditCalculatorTest {

    @Test
    public void creditRequestWithAvailableLessThanLimitShouldBeApprove() {
        // Arrange
        BigDecimal creditRequest = new BigDecimal("20000");
        BigDecimal creditAvailable = new BigDecimal("70000");
        BigDecimal creditLimit = new BigDecimal("100000");

        CreditCalculator creditCalculator = new CreditCalculator();
        boolean actualApprovalResult = creditCalculator.checkApprove(creditLimit, creditAvailable, creditRequest);

        assertTrue(actualApprovalResult);

    }

}
