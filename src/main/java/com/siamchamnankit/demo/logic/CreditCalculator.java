package com.siamchamnankit.demo.logic;

import java.math.BigDecimal;

public class CreditCalculator {

    public boolean checkApprove(BigDecimal creditLimit, BigDecimal creditAvailable, BigDecimal creditRequest) {
        if (creditLimit.compareTo(creditAvailable.add(creditRequest)) >= 0)
            return true;
        return false;
    }

}
