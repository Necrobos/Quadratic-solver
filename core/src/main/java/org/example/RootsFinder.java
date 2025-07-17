package org.example;

public class RootsFinder {
    /**
     * Класс для решения квадратного уравнения
     */
        public Solution solve(QuadraticEquation equation) {
            double a = equation.getA();
            double b = equation.getB();
            double c = equation.getC();

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                return new Solution(x1, x2);
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                return new Solution(x);
            } else {
                return new Solution(); // Нет действительных корней
            }
        }
}
