package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


/*
 * Программа для решения квадратного уравнения вида ax² + bx + c = 0.
 * Демонстрирует работу с классами:
 * - QuadraticEquation (хранит коэффициенты уравнения)
 * - RootsFinder (вычисляет корни)
 * - Solution (выводит результат)
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    // Инициализация логгера
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        if (args.length == 0) {
            logger.error("File error");
            logger.info("Using example: java -jar solver.jar input.txt");
            return;
        }

        try {
            logger.info("Begining to read file: {}", args[0]);
            File file = new File(args[0]);
            Scanner scanner = new Scanner(file);

            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            scanner.close();

            logger.info("Success read: a={}, b={}, c={}", a, b, c);

            QuadraticEquation equation = new QuadraticEquation(a, b, c);
            RootsFinder solver = new RootsFinder();
            Solution result = solver.solve(equation);

            result.print(equation);

        } catch (FileNotFoundException e) {
            logger.error("File not find: {}", args[0]);
        } catch (InputMismatchException e) {
            logger.error("Error format");
        } catch (Exception e) {
            logger.error("Critical error: ", e);
        }
    }
}