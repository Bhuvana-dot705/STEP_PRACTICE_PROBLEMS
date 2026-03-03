/*
 * WEEK_ 1 - LEVEL - 1 Practice Problems
 * 1. Find the age of Harry (birth year 2000, current year 2024)
 * 2. Find the area of a triangle in sq cm and sq inches given base and height in cm
 * 3. Convert 10.8 kilometers to miles
 * 4. Convert a distance in feet to yards and miles
 */

public class code {

    public static void main(String[] args) {

        // ---- Problem 1: Age Calculator ----
        System.out.println("Problem 1: Age Calculator");
        int currentYear = 2024;
        int birthYear = 2000;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);

        System.out.println();

        // ---- Problem 2: Area of a Triangle ----
        System.out.println("Problem 2: Area of a Triangle");
        double baseCm = 10.0;
        double heightCm = 5.0;
        double areaSqCm = 0.5 * baseCm * heightCm;
        double areaSqInches = areaSqCm / 6.4516; // 1 sq inch = 6.4516 sq cm
        System.out.printf("Base = %.1f cm, Height = %.1f cm%n", baseCm, heightCm);
        System.out.printf("Area of triangle = %.2f sq cm%n", areaSqCm);
        System.out.printf("Area of triangle = %.2f sq inches%n", areaSqInches);

        System.out.println();

        // ---- Problem 3: Kilometers to Miles ----
        System.out.println("Problem 3: Kilometers to Miles");
        double kilometers = 10.8;
        double miles = kilometers / 1.60934; // 1 mile = 1.60934 km
        System.out.printf("The distance %.1f km in miles is %.2f%n", kilometers, miles);

        System.out.println();

        // ---- Problem 4: Feet to Yards and Miles ----
        System.out.println("Problem 4: Feet to Yards and Miles");
        double feet = 5280.0;
        double yards = feet / 3.0;        // 1 yard = 3 feet
        double milesFromFeet = feet / 5280.0; // 1 mile = 5280 feet
        System.out.printf("%.1f feet = %.2f yards%n", feet, yards);
        System.out.printf("%.1f feet = %.4f miles%n", feet, milesFromFeet);
    }
}