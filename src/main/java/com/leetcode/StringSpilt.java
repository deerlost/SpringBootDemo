package com.leetcode;


import java.util.Scanner;

/**
 * @Description
 * @Package com.leetcode
 * @anthor：wyang
 * @date：2021/2/24
 */
public class StringSpilt {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] source = sc.nextLine().toCharArray();
            int length = source.length;
            int count = 0;

            while (length > 0) {
                char[] arr = new char[]{'0','0','0','0','0','0','0','0'};
                for (int i = 0; i < length && i < 8; i++) {
                    arr[i] = source[count];
                    count++;
                }
                length = length - 8;
                System.out.println(arr);
            }
        }
    }
}
