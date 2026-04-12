/*
 * LEVEL 2 Practice Problems
 *
 * 1. Find factors of a number, store in array and compute:
 *    sum, product, sum of squares
 * 2. Sum of n natural numbers using recursion and formula
 * 3. Check whether a year is a Leap Year
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== 1. Factors =====
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        int sum = 0;
        long product = 1;
        double sumSq = 0;

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
            sum += f;
            product *= f;
            sumSq += Math.pow(f, 2);
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Sum of Squares: " + sumSq);


        // ===== 2. Sum of n =====
        System.out.print("\nEnter n: ");
        int n = sc.nextInt();

        if (n > 0) {
            int r1 = recSum(n);
            int r2 = n * (n + 1) / 2;

            System.out.println("Recursion: " + r1);
            System.out.println("Formula: " + r2);
        }


        // ===== 3. Leap Year =====
        System.out.print("\nEnter year: ");
        int year = sc.nextInt();

        if (year >= 1582 && isLeap(year))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");

        sc.close();
    }

    // Find factors
    static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] arr = new int[count];
        int j = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0) arr[j++] = i;

        return arr;
    }

    // Recursive sum
    static int recSum(int n) {
        if (n == 1) return 1;
        return n + recSum(n - 1);
    }

    // Leap year
    static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}