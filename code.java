/*
 * WEEK_ 1 , 2 - LEVEL - 3 Practice Problems
 * 1. Temperature Conversion: Celsius to Fahrenheit
 * 2. Temperature Conversion: Fahrenheit to Celsius
 */

import java.util.Scanner;

public class code {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ---- Problem 1: Celsius to Fahrenheit ----
        System.out.println("Problem 1: Celsius to Fahrenheit");
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);

        System.out.println();

        // ---- Problem 2: Fahrenheit to Celsius ----
        System.out.println("Problem 2: Fahrenheit to Celsius");
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitInput = scanner.nextDouble();
        double celsiusResult = (fahrenheitInput - 32) * 5 / 9;
        System.out.printf("Temperature in Celsius: %.2f%n", celsiusResult);

        scanner.close();
    }
}