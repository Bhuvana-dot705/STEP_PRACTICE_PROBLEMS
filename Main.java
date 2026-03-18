/*
 * WEEK 5, 6 - LEVEL 2 Practice Problems
 *
 * 1. Calculate the bonus for 10 employees based on years of service and compute
 *    the total bonus payout plus total old and new salary.
 * 2. Find the youngest and tallest friend among Amar, Akbar, and Anthony.
 * 3. Store digits of a number in an array and find the largest and second largest digit.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // =====================================================
        // QUESTION 1: Employee Bonus Calculation (Zara Company)
        // =====================================================
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            System.out.print("  Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("  Years of service: ");
            years[i] = sc.nextDouble();

            if (salary[i] < 0 || years[i] < 0) {
                System.out.println("  Invalid input! Enter again.");
                i--; // retry same employee
                continue;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);


        // =====================================================
        // QUESTION 2: Youngest & Tallest Friend
        // =====================================================
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        System.out.println("\nEnter age and height of 3 friends:");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + ":");
            System.out.print("  Age: ");
            age[i] = sc.nextInt();
            System.out.print("  Height: ");
            height[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("Youngest friend: " + names[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex]);


        // =====================================================
        // QUESTION 3: Largest & Second Largest Digit
        // =====================================================
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        System.out.print("\nEnter a number: ");
        int number = sc.nextInt();

        if (number == 0) {
            digits[index++] = 0;
        }

        while (number != 0 && index < maxDigit) {
            digits[index++] = Math.abs(number % 10);
            number /= 10;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        if (secondLargest != 0 || (index > 1 && largest == 0)) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit not found");
        }

        sc.close();
    }
}
