package com.alter.diman;

public class FeeCalculator {

    public static double calculateFee(RatePlan ratePlan, double amount) {

        try {
            switch (ratePlan) {
                case START: {
                    if (amount >= 10 && amount < 100) return 0.01;
                    else if (amount >= 100 && amount <= 1000) return 0.009;
                    else throw new IllegalFeeException("You can transfer money in range from 10 to 1000 only");
                }
                case MAXIMUM: {
                    if (amount >= 10 && amount < 100) return 0.008;
                    else if (amount >= 100 && amount <= 1000) return 0.007;
                    else throw new IllegalFeeException("You can transfer money in range from 10 to 1000 only");
                }
                case ULTRA: {
                    if (amount >= 10 && amount < 100) return 0.006;
                    else if (amount >= 100 && amount <= 1000) return 0.005;
                    else throw new IllegalFeeException("You can transfer money in range from 10 to 1000 only");
                }
            }
        } catch (IllegalFeeException e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }
}
