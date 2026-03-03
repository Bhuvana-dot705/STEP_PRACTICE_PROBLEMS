/*
 * WEEK_ 3 , 4 - LEVEL - 2 Practice Problems
 * 1. Print odd and even numbers between 1 to n
 * 2. Find bonus of employees based on years of service
 * 3. Print multiplication table of a number from 6 to 9
 */

import java.util.Scanner;

public class code {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ---- Problem 1: Odd and Even Numbers ----
        System.out.println("Problem 1: Odd and Even Numbers");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        System.out.println();

        // ---- Problem 2: Employee Bonus Calculator ----
        System.out.println("Problem 2: Employee Bonus Calculator");
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is " + bonus);
        } else {
            System.out.println("No bonus. Years of service is not more than 5 years.");
        }

        System.out.println();

        // ---- Problem 3: Multiplication Table (6 to 9) ----
        System.out.println("Problem 3: Multiplication Table (6 to 9)");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        scanner.close();
    }
}