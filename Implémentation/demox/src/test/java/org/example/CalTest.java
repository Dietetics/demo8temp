package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalTest {



    @Test
    public void testAdd() {
        Cal calculator = new Cal();
        int result = calculator.add(3, 5);
        assertEquals(8, result, "Addition of 3 and 5 should be 8");
    }

    @Test
    public void testSubtract() {
        Cal calculator = new Cal();
        int result = calculator.subtract(8, 3);
        assertEquals(5, result, "Subtraction of 3 from 8 should be 5");
    }

    @Test
    public void testMultiply() {
        Cal calculator = new Cal();
        int result = calculator.multiply(4, 5); // Supposons que vous ayez une méthode multiply
        assertEquals(20, result, "Multiplication of 4 and 5 should be 20");
    }

    @Test
    public void testDivide() {
        try {
            Cal calculator = new Cal();
            int result = calculator.divide(10, 2); // Supposons que vous ayez une méthode divide
            assertEquals(5, result, "Division of 10 by 2 should be 5");
        } catch (ArithmeticException e) {
            fail("Division by zero should not throw an exception");
        }
    }
}
