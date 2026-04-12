/*
 * LEVEL 1 Practice Problems
 *
 * 1. Calculate Simple Interest
 * 2. Calculate Maximum Handshakes
 * 3. Calculate Athlete Rounds in Triangular Park
 * 4. Check whether number is Positive, Negative or Zero
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // =====================================================
        // QUESTION 1: Simple Interest
        // =====================================================
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double si = calculateSI(principal, rate, time);

        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);


        // =====================================================
        // QUESTION 2: Maximum Handshakes
        // =====================================================
        System.out.print("\nEnter number of students: ");
        int n = sc.nextInt();

        int handshakes = calculateHandshakes(n);

        System.out.println("Maximum number of handshakes: " + handshakes);


        // =====================================================
        // QUESTION 3: Athlete Rounds
        // =====================================================
        System.out.print("\nEnter side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);

        System.out.println("Number of rounds to complete 5 km: " + rounds);


        // =====================================================
        // QUESTION 4: Number Check
        // =====================================================
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();

        int result = checkNumber(num);

        if (result == 1) {
            System.out.println("Positive Number");
        } else if (result == -1) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }

    // Method for Simple Interest
    public static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    // Method for Handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    // Method for Athlete Rounds
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km in meters
        return distance / perimeter;
    }

    // Method for Number Check
    public static int checkNumber(int num) {
        if (num > 0)
            return 1;
        else if (num < 0)
            return -1;
        else
            return 0;
    }
}