package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/sum")
    public int sum(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return a + b;
    }

    @RequestMapping("/mul")
    int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @RequestMapping("/quad")
    public int quad(
            @RequestParam int a
    ) {
        return a * a;
    }

    @RequestMapping("/abs")
    public int abs(
            @RequestParam int a
    ) {
        return Math.abs(a);
    }

    @RequestMapping("/exp")
    public double exp(
            @RequestParam double a,
            @RequestParam double b
    ) {
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
