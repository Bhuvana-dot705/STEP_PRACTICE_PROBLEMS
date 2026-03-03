/*
 * WEEK_ 3 , 4 - LEVEL - 1 Practice Problems
 * 1. Check if a number is divisible by 5
 * 2. Check if the first number is the smallest of 3 numbers
 * 3. Check which of the three numbers is the largest
 * 4. Check for natural number and find the sum of n natural numbers
 */

import java.util.Scanner;

public class code {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ---- Problem 1: Divisible by 5 ----
        System.out.println("Problem 1: Divisible by 5");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean divisible = number % 5 == 0;
        System.out.println("Is the number " + number + " divisible by 5? " + divisible);

        System.out.println();

        // ---- Problem 2: Is First Number the Smallest ----
        System.out.println("Problem 2: Is First Number the Smallest");
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter number3: ");
        int number3 = scanner.nextInt();
        boolean isSmallest = number1 < number2 && number1 < number3;
        System.out.println("Is the first number the smallest? " + isSmallest);

        System.out.println();

        // ---- Problem 3: Which Number is the Largest ----
        System.out.println("Problem 3: Which Number is the Largest");
        System.out.print("Enter number1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number3: ");
        int num3 = scanner.nextInt();
        boolean firstLargest = num1 >= num2 && num1 >= num3;
        boolean secondLargest = num2 >= num1 && num2 >= num3;
        boolean thirdLargest = num3 >= num1 && num3 >= num2;
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

        System.out.println();

        // ---- Problem 4: Sum of N Natural Numbers ----
        System.out.println("Problem 4: Sum of N Natural Numbers");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n > 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        scanner.close();
    }
}