// Реализовать простой калькулятор (пользователь вводит 2 числа и
// вводит операцию (+ - / *). 
// int a ; int b; String op (op!=”Stop”); (char != ’b’)

// К калькулятору из предыдущего дз добавить логирование.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task__2_4_Calculator {

    private static final Logger LOGGER = Logger.getLogger(Task__2_4_Calculator.class.getName());

    public static void main(String[] args) throws IOException {
        // Создаем обработчик файлового журнала
        FileHandler fileHandler = new FileHandler("calculator.log");
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        LOGGER.addHandler(fileHandler);

        Scanner scanner = new Scanner(System.in);
        int a, b;
        String op;

        while (true) {
            System.out.print("Enter first number (or '0' to exit): ");
            a = scanner.nextInt();

            if (a == 0) {
                break;
            }

            System.out.print("Enter second number: ");
            b = scanner.nextInt();

            System.out.print("Enter operator (+, -, *, /) or 'Stop' to exit: ");
            op = scanner.next();

            if (op.equals("Stop")) {
                break;
            }

            int result = calculate(a, b, op);
            LOGGER.log(Level.INFO, "Result: {0} {1} {2} = {3}", new Object[]{a, op, b, result});
        }

        scanner.close();
    }

    private static int calculate(int a, int b, String op) {
        int result = 0;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    LOGGER.log(Level.WARNING, "Division by zero");
                } else {
                    result = a / b;
                }
                break;
            default:
                LOGGER.log(Level.WARNING, "Unknown operator: {0}", op);
        }
        return result;
    }
}
