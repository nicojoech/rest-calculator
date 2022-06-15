package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    Calculator calculator = new Calculator();

    @RequestMapping("/sum")
    public int sum(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.sum(a, b);
    }

    @RequestMapping("/mul")
    int multiply(
            @RequestParam int a,
            @RequestParam int b
    ) {
        return calculator.mul(a, b);
    }

    @RequestMapping("/quad")
    public int quad(
            @RequestParam int a
    ) {
        return calculator.quad(a);
    }

    @RequestMapping("/abs")
    public int abs(
            @RequestParam int a
    ) {
        return calculator.abs(a);
    }

    @RequestMapping("/exp")
    public double exp(
            @RequestParam double a,
            @RequestParam double b
    ) {
        return calculator.exp(a, b);
    }


}
