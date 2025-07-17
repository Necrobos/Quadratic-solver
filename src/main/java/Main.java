
import java.util.Scanner;


/**
 * Программа для решения квадратного уравнения вида ax² + bx + c = 0.
 * Демонстрирует работу с классами:
 * - QuadraticEquation (хранит коэффициенты уравнения)
 * - RootsFinder (вычисляет корни)
 * - Solution (выводит результат)
 */
public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner user_input = new Scanner (System.in);
        System.out.println("Введите коэффицент при x^2: ");
        a = user_input.nextDouble();
        System.out.println("Введите коэффицент при x: ");
        b = user_input.nextDouble();
        System.out.println("Введите коэффицент при свободном члене: ");
        c = user_input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        RootsFinder solver = new RootsFinder();
        Solution result = solver.solve(equation);

        result.print(equation);
    }
}