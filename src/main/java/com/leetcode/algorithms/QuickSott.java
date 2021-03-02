package com.leetcode.algorithms;

import java.util.Arrays;

/**
 * @Description TODO
 * @ClassName： :
 * @Package
 * @anthor：wyang
 * @date：
 * @版本：V1.0
 */
public class QuickSott {

    public static void main(String[] args) {
        int[] arr = new int[] {9,4,6,8,3,10,4,6};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }
        int p = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (arr[j] >= p && i < j) {
                j--;
            }
            while (arr[i] <= p && i < j) {
                i++;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        arr[low] = arr[i];
        arr[i] =p;
        quickSort(arr,low,j-1);
        quickSort(arr,j+1 ,high);
    }
}

