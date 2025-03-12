package dp;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    static int[] memo;

    public static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        if (memo[n] != -1)
            return memo[n];
        return memo[n] = fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term of fibonacci: ");
        int n = sc.nextInt();
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        int res = fib(n);
        System.out.println(res);
        sc.close();
    }
}
