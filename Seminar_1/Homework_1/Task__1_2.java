
// Вывести все простые числа от 1 до 1000

public class Task__1_2 {
    
    public static void main(String[] args) {
        
        int range = 1000;
        printPrimes(range);

    }
    
    public static void printPrimes(int n) {
        if (n <= 1) System.exit(0);
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }
    }
}
