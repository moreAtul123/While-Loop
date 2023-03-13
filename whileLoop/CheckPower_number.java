package whileLoop;

import java.util.Scanner;

public class CheckPower_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = 1;
        while (exponent != 0) {
            result *= base;
                      --exponent;

        }

        System.out.println(base + " to the power of " + exponent + " is: " + result);
    }
}


