package com.alter.diman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FeeTest {

    @Test
    public void testRatePlans() {
        //START Rate Plan
        Assertions.assertEquals(FeeCalculator.calculateFee(RatePlan.START, 1), 0);
        Assertions.assertEquals(FeeCalculator.calculateFee(RatePlan.START, 10), 0.01);
        Assertions.assertEquals(FeeCalculator.calculateFee(RatePlan.START, 100), 0.009);
        Assertions.assertEquals(FeeCalculator.calculateFee(RatePlan.START, 1000), 0.009);

        //MAXIMUM Rate Plan
        Assertions.assertEquals(FeeCalculator.calculateFee(RatePlan.MAXIMUM, 1), 0);
        Assertions.assertEquals(FeeCalculator.calculateFee(RatePlan.MAXIMUM, 10), 0.008);
        Assertions.assertEquals(FeeCalculator.calculateFee(RatePlan.MAXIMUM, 100), 0.007);
        Assertions.assertEquals(FeeCalculator.calculateFee(RatePlan.MAXIMUM, 1000), 0.007);

        //ULTRA Rate Plan
        Assertions.assertEquals(FeeCalculator.calculateFee(RatePlan.ULTRA, 1), 0);
        Assertions.assertEquals(FeeCalculator.calculateFee(RatePlan.ULTRA, 10), 0.006);
        Assertions.assertEquals(FeeCalculator.calculateFee(RatePlan.ULTRA, 100), 0.005);
        Assertions.assertEquals(FeeCalculator.calculateFee(RatePlan.ULTRA, 1000), 0.005);
    }
}
