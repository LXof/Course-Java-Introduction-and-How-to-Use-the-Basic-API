// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

// Формула для вычисления n-го треугольного числа Tn:
// Tn = n * (n + 1) / 2

import java.util.Scanner;

public class Task__1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int triangularNumber = GetTriangularNumber(scanner);
        System.out.println(String.format("Результат %d-го треугольног числа: %d", triangularNumber, CalculateTriangularNumber(triangularNumber)));
        int nFactorial = GetInput_NFactorial(scanner);
        System.out.println(String.format("Факториал числа %d! = %d", nFactorial, FindFactorial(nFactorial)));
    }

    public static int GetTriangularNumber(Scanner scanner) {
        System.out.print("Введите n-е треугольное число: ");
        int n = scanner.nextInt();
        return n;   
    }

    public static int CalculateTriangularNumber(int triangularNumber) {
        return triangularNumber * (triangularNumber + 1) / 2;
    }

    public static int GetInput_NFactorial(Scanner scanner) {
        System.out.print("Введите число факториал: n! = ");
        int nFactorial = scanner.nextInt();
        return nFactorial;
    }

    public static int FindFactorial(int nFuctorial) {
        int resut = 1;
        for (int i = 1; i <= nFuctorial; i++) {
            resut *= i;
        }
        return resut;
    }
}

