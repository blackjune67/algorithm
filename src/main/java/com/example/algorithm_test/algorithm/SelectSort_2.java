package com.example.algorithm_test.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SelectSort_2 {
    public static void main(String[] args) {
        int temp;
        int min;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("return = " + Arrays.toString(arr));
    }
}
