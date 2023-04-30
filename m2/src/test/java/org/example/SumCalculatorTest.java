package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
   private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach(){
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSumMethodOne() {
        assertEquals(1,sumCalculator.sum(1));
    }

    @Test
    void testSumMethodTwo() {
        assertEquals(6,sumCalculator.sum(3));
    }

    @Test
    void testSumMethodWithZeroArgument(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });
    }

    @AfterEach
    public void afterEach(){
        sumCalculator = null;
    }
}