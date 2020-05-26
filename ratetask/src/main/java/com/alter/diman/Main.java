package com.alter.diman;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the RatePlan: " + RatePlan.START.toString());
        System.out.println(FeeCalculator.calculateFee(RatePlan.START, 432));
        System.out.println(FeeCalculator.calculateFee(RatePlan.START, 32));
        System.out.println(FeeCalculator.calculateFee(RatePlan.START, 2));
        System.out.println("This is the RatePlan: " + RatePlan.MAXIMUM.toString());
        System.out.println(FeeCalculator.calculateFee(RatePlan.MAXIMUM, 432));
        System.out.println(FeeCalculator.calculateFee(RatePlan.MAXIMUM, 32));
        System.out.println(FeeCalculator.calculateFee(RatePlan.MAXIMUM, 2));
        System.out.println("This is the RatePlan: " + RatePlan.ULTRA.toString());
        System.out.println(FeeCalculator.calculateFee(RatePlan.ULTRA, 432));
        System.out.println(FeeCalculator.calculateFee(RatePlan.ULTRA, 32));
        System.out.println(FeeCalculator.calculateFee(RatePlan.ULTRA, 2));
    }
}
