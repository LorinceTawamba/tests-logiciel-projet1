package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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
    @Order(3)
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
    @Order(2)
    void soustraction() {
        System.out.println("===== TEST SOUSTRACTION =====");
        r = x - y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("r = " + r);
        // addition(2,4) == 6
        Calculatrice cal = new Calculatrice(x,y);
        // 2, 4, 6
        assertEquals(r, cal.soustraction());
    }

    @Test
    @Order(1)
    void multiplication() {
        System.out.println("===== TEST MULTIPLICATION =====");
        r = x * y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("r = " + r);
        // addition(2,4) == 6
        Calculatrice cal = new Calculatrice(x,y);
        // 2, 4, 6
        assertEquals(r, cal.multiplication());
    }

    @Test
    void division() {
    }
}