package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(6, 4));
    }

    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(20, calc.multiply(4, 5));
    }
}
// This class contains unit tests for the Calculator class.
// It tests the add and multiply methods to ensure they return the expected
// results.
// The tests use JUnit assertions to verify the correctness of the methods.
// If the methods do not return the expected results, the tests will fail,
// indicating an issue
// with the Calculator implementation.