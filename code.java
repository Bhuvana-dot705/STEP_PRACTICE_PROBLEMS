/*
 * WEEK_ 1 , 2 - LEVEL - 2 Practice Problems
 * 1. Create a basic calculator for addition, subtraction, multiplication, and division
 * 2. Find the side of the square given its perimeter
 * 3. Find the area of a triangle in sq inches and sq cm given base and height in cm
 */

import java.util.Scanner;

public class code {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ---- Problem 1: Basic Calculator ----
        System.out.println("Problem 1: Basic Calculator");
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f%n",
                          number1, number2, addition, subtraction, multiplication, division);

        System.out.println();

        // ---- Problem 2: Side of a Square from Perimeter ----
        System.out.println("Problem 2: Side of a Square from Perimeter");
        System.out.print("Enter perimeter of the square: ");
        double perimeter = scanner.nextDouble();
        double side = perimeter / 4.0;
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);

        System.out.println();

        // ---- Problem 3: Area of a Triangle ----
        System.out.println("Problem 3: Area of a Triangle");
        System.out.print("Enter base of the triangle in cm: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle in cm: ");
        double height = scanner.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaIn, areaCm);

        scanner.close();
    }
}