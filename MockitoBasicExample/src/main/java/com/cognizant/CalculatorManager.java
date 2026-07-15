package com.cognizant;

public class CalculatorManager {

    private CalculatorService calculatorService;

    public CalculatorManager(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int performAddition(int a, int b) {
        return calculatorService.add(a, b);
    }

    public int performMultiplication(int a, int b) {
        return calculatorService.multiply(a, b);
    }
}