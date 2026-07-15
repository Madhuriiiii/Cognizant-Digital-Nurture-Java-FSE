package com.cognizant;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EvenNumberTest {

    private int input;
    private EvenNumber evenNumber;

    public EvenNumberTest(int input) {
        this.input = input;
        this.evenNumber = new EvenNumber();
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {2},
                {4},
                {6},
                {8},
                {10}
        });
    }

    @Test
    public void testEvenNumbers() {
        assertTrue(evenNumber.isEven(input));
    }
}