 

import java.util.Scanner;
public class prime2 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
            System.out.println("The next five prime numbers are:");
            printNextFivePrimes(num);
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    // Function to print the next five prime numbers
    public static void printNextFivePrimes(int num) {
        int count = 0;
        for (int i = num + 1; count < 5; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
    }
}


