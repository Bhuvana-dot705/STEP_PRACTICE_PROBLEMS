/*
 * LEVEL 3 Practice Programs 
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ===== 1. Football Heights =====
        int[] h = new int[11];
        Random r = new Random();

        for (int i = 0; i < h.length; i++)
            h[i] = 150 + r.nextInt(101);

        int sum = 0, min = h[0], max = h[0];

        System.out.print("Heights: ");
        for (int x : h) {
            System.out.print(x + " ");
            sum += x;
            if (x < min) min = x;
            if (x > max) max = x;
        }

        System.out.println("\nMean: " + (double) sum / h.length);
        System.out.println("Shortest: " + min);
        System.out.println("Tallest: " + max);


        // ===== 2. NumberChecker =====
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int n = sc.nextInt();

        int[] d = NumberChecker.getDigits(n);

        System.out.println("Digits: " + d.length);
        System.out.println("Duck: " + NumberChecker.isDuck(d));
        System.out.println("Armstrong: " + NumberChecker.isArmstrong(n, d));

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int x : d) {
            if (x > max1) { max2 = max1; max1 = x; }
            else if (x > max2 && x != max1) max2 = x;

            if (x < min1) { min2 = min1; min1 = x; }
            else if (x < min2 && x != min1) min2 = x;
        }

        System.out.println("Largest: " + max1 + ", Second: " + max2);
        System.out.println("Smallest: " + min1 + ", Second: " + min2);

        sc.close();
    }
}
// ===== Utility Class =====
class NumberChecker {

    static int[] getDigits(int n) {
        String s = String.valueOf(Math.abs(n));
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i) - '0';
        return arr;
    }

    static boolean isDuck(int[] d) {
        for (int x : d)
            if (x == 0) return true;
        return false;
    }

    static boolean isArmstrong(int n, int[] d) {
        int sum = 0;
        for (int x : d)
            sum += (int) Math.pow(x, d.length);
        return sum == Math.abs(n);
    }
}