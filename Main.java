/*
 * WEEK_ 5 , 6 - LEVEL - 1 Practice Problems
 * 1. To check wheather the studets can vote depending on age
 * 2.To check wheather the number is positive , negative or zero
 * 3. To print the multiplication table of a number
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================================
        // QUESTION 1: Voting Eligibility
        // ================================
        int[] age = new int[10];

        System.out.println("Enter ages of 10 students:");
        for(int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility:");
        for(int i = 0; i < age.length; i++) {
            if(age[i] < 0) {
                System.out.println("Invalid age");
            }
            else if(age[i] >= 18) {
                System.out.println("The student with age " + age[i] + " can vote");
            }
            else {
                System.out.println("The student with age " + age[i] + " cannot vote");
            }
        }


        // ==========================================
        // QUESTION 2: Number Analysis (5 Numbers)
        // ==========================================
        int[] arr = new int[5];

        System.out.println("\nEnter 5 numbers:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nNumber Analysis:");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                if(arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is Positive and Even");
                } else {
                    System.out.println(arr[i] + " is Positive and Odd");
                }
            }
            else if(arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            }
            else {
                System.out.println(arr[i] + " is Zero");
            }
        }

        // Compare first and last element
        if(arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last elements are Equal");
        }
        else if(arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is Greater than last");
        }
        else {
            System.out.println("First element is Less than last");
        }


        // ==========================================
        // QUESTION 3: Multiplication Table
        // ==========================================
        int num;
        int[] table = new int[10];

        System.out.print("\nEnter a number for multiplication table: ");
        num = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
        }

        System.out.println("\nMultiplication Table:");
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}