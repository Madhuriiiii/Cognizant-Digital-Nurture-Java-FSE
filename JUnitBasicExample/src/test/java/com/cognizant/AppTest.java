package com.cognizant;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

    Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass executed");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass executed");
    }

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Before Test");
    }

    @After
    public void tearDown() {
        System.out.println("After Test");
    }

    @Test
    public void testAddition() {
        System.out.println("Executing testAddition");
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    public void testSubtraction() {
        System.out.println("Executing testSubtraction");
        assertEquals(5, calculator.subtract(10, 5));
    }
}