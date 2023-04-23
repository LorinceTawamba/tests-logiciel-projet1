package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    @Test
    void addition() {
        System.out.println("===== TEST ADDITION =====");
        // addition(2,4) == 6
        double x = 2;
        double y = 4;
        double r = 6;
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