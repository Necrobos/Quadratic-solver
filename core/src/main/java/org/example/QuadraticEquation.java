package org.example;

/**
 * Класс для представления квадратного уравнения ax² + bx + c = 0
 */
public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Coefficient 'a' cannot be zero");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    @Override
    public String toString() {
        return String.format("%.1fx² + %.1fx + %.1f = 0", a, b, c);
    }
}