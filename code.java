/*
 * WEEK_ 3 , 4 - LEVEL - 3 Practice Problems
 * 1. Leap Year checker using multiple if-else statements
 * 2. Leap Year checker using single if condition with logical operators
 */

import java.util.Scanner;

public class code {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ---- Problem 1: Leap Year (Multiple If-Else) ----
        System.out.println("Problem 1: Leap Year (Multiple If-Else)");
        System.out.print("Enter a year: ");
        int year1 = scanner.nextInt();
        if (year1 < 1582) {
            System.out.println(year1 + " is not a valid Gregorian calendar year");
        } else if (year1 % 400 == 0) {
            System.out.println(year1 + " is a Leap Year");
        } else if (year1 % 100 == 0) {
            System.out.println(year1 + " is not a Leap Year");
        } else if (year1 % 4 == 0) {
            System.out.println(year1 + " is a Leap Year");
        } else {
            System.out.println(year1 + " is not a Leap Year");
        }

        System.out.println();

        // ---- Problem 2: Leap Year (Single If with Logical Operators) ----
        System.out.println("Problem 2: Leap Year (Single If with Logical Operators)");
        System.out.print("Enter a year: ");
        int year2 = scanner.nextInt();
        if (year2 < 1582) {
            System.out.println(year2 + " is not a valid Gregorian calendar year");
        } else if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0)) {
            System.out.println(year2 + " is a Leap Year");
        } else {
            System.out.println(year2 + " is not a Leap Year");
        }

        scanner.close();
    }
}