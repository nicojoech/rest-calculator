package com.example.restcalculator;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int quad(int a) {
        return a * a;
    }

    public int abs(int a) {
        return Math.abs(a);
    }

    public double exp(double a, double b) {
        if (b == 0) {
            return 1;
        } else if (b < 0) {
            return 1 / exp2(a, b);
        } else {
            return exp2(a, b);
        }
    }

    public double exp2(double a, double b) {
        int val = 1;
        if (b < 0) {
            b *= -1;
        }
        for (int i = 0; i < b; i++) {
            val *= a;
        }
        return val;
    }

}
