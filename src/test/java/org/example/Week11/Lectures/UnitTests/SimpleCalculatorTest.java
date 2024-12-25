package org.example.Week11.Lectures.UnitTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoSHouldEqualFour(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
        assertNotEquals(5, calculator.add(2,2));
        assertTrue(4 == calculator.add(2, 2));
        assertFalse(5 == calculator.add(2, 2));
        assertNull(null);
        assertNotNull(1);
    }

    // ako bi u add metodi napisali return a*b
    // test bi opet bio validan, jer je 2*2 = 4
    // zbog toga moramo da napisemo vise testova da bi pokli razlicite slucajeve


    @Test
    void twoPlusTwoEqualsSeven() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(7,calculator.add(2,2));
    }

}