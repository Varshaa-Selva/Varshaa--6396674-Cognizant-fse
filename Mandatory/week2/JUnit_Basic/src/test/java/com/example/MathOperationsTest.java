package com.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathOperationsTest {

    private MathOperations mathOps;

    @Before
    public void setUp() {
        System.out.println("Setting up test!..");
        mathOps = new MathOperations();
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up after test!..");
        mathOps = null;
    }

    @Test
    public void testSquare() {
        // Arrange
        int input = 5;

        // Act
        int result = mathOps.square(input);

        // Assert
        assertEquals(25, result);
    }

    @Test
    public void testCube() {
        // Arrange
        int input = 3;

        // Act
        int result = mathOps.cube(input);

        // Assert
        assertEquals(27, result);
    }

    @Test
    public void testIsEven() {
        // Arrange
        int input = 8;

        // Act
        boolean result = mathOps.isEven(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsNotEven() {
        // Arrange
        int input = 7;

        // Act
        boolean result = mathOps.isEven(input);

        // Assert
        assertFalse(result);
    }
}
