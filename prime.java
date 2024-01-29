
import java.util.Scanner;
public class prime 
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int average = (num1 + num2) / 2;

        System.out.println("Prime numbers between 1 and the average (" + average + "):");


        for (int i = 2; i <= average; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}