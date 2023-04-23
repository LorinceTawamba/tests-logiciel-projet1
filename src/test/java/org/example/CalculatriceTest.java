package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {
    private double x;
    private double y;
    private double r;

    @BeforeEach
    void setUp() {
        x=100*Math.random();
        y=50*Math.random();
    }

    @Test
    void addition() {
        System.out.println("===== TEST ADDITION =====");
        r = x + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("r = " + r);
        // addition(2,4) == 6
        Calculatrice cal = new Calculatrice(x,y);
        // 2, 4, 6
        assertEquals(r, cal.addition());
    }

    @Test
    void soustraction() {
    }

    @Test
    void multiplication() {
    }

    @Test
    void division() {
    }
}