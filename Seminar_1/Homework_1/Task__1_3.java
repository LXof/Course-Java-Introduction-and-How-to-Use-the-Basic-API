// Реализовать простой калькулятор (пользователь вводит 2 числа и
// вводит операцию (+ - / *). 
// int a ; int b; String op (op!=”Stop”); (char != ’b’)

import java.util.Scanner;

public class Task__1_3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float number1 = 16f;
        float number2 = 6f;
        float result = 0f;

        System.out.print("Введите операцию (+, -, *, /) или \"Stop\" для выхода: ");
        String op = scanner.nextLine();
        scanner.close();

        if (op.equalsIgnoreCase("stop")) {
            System.out.println("До свидания!");
            System.exit(1);
        }
        
        switch (op) {
            case "+": 
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                System.out.println("Ошибка: неверная операция!");
                System.exit(1);
        }
            
        System.out.printf("Результат: " + result);
    }

}