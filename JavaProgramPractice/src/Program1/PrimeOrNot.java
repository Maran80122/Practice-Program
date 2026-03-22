package Program1;

import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        System.out.println("Prime number or not");

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s.nextInt();

        boolean isPrime = true;

        if (a <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }

        s.close(); // ✅ Good practice
    }
}
