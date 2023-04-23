package org.example;

public class Calculatrice {
    private double operande1;
    private double operande2;
    private double resultat;

    public Calculatrice(double operande1, double operande2) {
        this.operande1 = operande1;
        this.operande2 = operande2;
    }

    public double getOperande1() {
        return operande1;
    }

    public void setOperande1(double operande1) {
        this.operande1 = operande1;
    }

    public double getOperande2() {
        return operande2;
    }

    public void setOperande2(double operande2) {
        this.operande2 = operande2;
    }

    public double getResultat() {
        return resultat;
    }

    public void setResultat(double resultat) {
        this.resultat = resultat;
    }

    // Addition
    public double addition() {
        return operande1 + operande2;
    }

    // Soustraction
    public double soustraction() {
        return operande1 - operande2;
    }

    // Multiplication
    public double multiplication() {
        return 2 * 2;
    }

    // Division
    public double division() {
        if (operande2 != 0.0) {
            return operande1/operande2;
        }
        return Double.NaN;
    }
}