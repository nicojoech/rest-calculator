package com.example.restcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();


    @Test
    void sumTest() {
        //Arrange
        int a = 2;
        int b = 5;

        int expectedResult = 7;

        //Act
        int result = calculator.sum(a, b);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void mulTest() {
        //Arrange
        int a = 2;
        int b = 5;

        int expectedResult = 10;

        //Act
        int result = calculator.mul(a, b);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void quadTest() {
        //Arrange
        int a = 2;

        int expectedResult = 4;

        //Act
        int result = calculator.quad(a);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void absTest() {
        //Arrange
        int a = -2;

        int expectedResult = 2;

        //Act
        int result = calculator.abs(a);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void expTest1() {
        //Arrange
        double a = 2;
        double b = 3;

        double expectedResult = 8;

        //Act
        double result = calculator.exp(a, b);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void expTest2() {
        //Arrange
        double a = 2;
        double b = 0;

        double expectedResult = 1;

        //Act
        double result = calculator.exp(a, b);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void expTest3() {
        //Arrange
        double a = 2;
        double b = -1;

        double expectedResult = 0.5;

        //Act
        double result = calculator.exp(a, b);

        //Assert
        assertEquals(expectedResult, result);
    }


}