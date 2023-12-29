package com.example.algorithm_test.algo_int;

import java.util.Scanner;

public class int_06 {

    public static int result(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if((i%3) == 0 || (i%5) == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int result = result(i);
        System.out.println("==> result : " + result);
    }
}
