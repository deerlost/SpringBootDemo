package com.leetcode;


import java.util.Scanner;

/**
 * @Description TODO 斐波那契函数
 * @ClassName：DynamicPro :
 * @Package com.leetcode
 * @anthor：wyang
 * @date：2020/2/19
 * @版本：V1.0
 */
public class DynamicPro {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(Fibonacci(n));
        }
    }

    private static int Fibonacci(int n) {
        int[] Memo = new int[n + 1];

        for (int i = 0; i < n + 1; i++)
            Memo[i] = -1;

        return fib(Memo, n);

    }

    private static int fib(int[] Memo, int n) {
        if (Memo[n] != -1) return Memo[n];

        if (n <= 1) return n;
        else Memo[n] = fib(Memo, n - 1) + fib(Memo, n - 2);
        return Memo[n];
    }

}
