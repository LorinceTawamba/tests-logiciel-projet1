package org.example;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        double x = 10;
        double y = 2;
        int number = 51;
        System.out.println("===== PROJET 1 =====");
        Calculatrice cal = new Calculatrice(x,y);
        System.out.println(x + " + " + y + " = " + cal.addition());
        System.out.println(x + " - " + y + " = " + cal.soustraction());
        System.out.println(x + " * " + y + " = " + cal.multiplication());
        System.out.println(x + " / " + y + " = " + cal.division());
        System.out.println(number + " = " + cal.isValueOK(number));
    }
}