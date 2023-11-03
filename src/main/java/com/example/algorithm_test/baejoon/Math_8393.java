package com.example.algorithm_test.baejoon;

import java.util.Scanner;

public class Math_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = 0;
        for (int i = 0; i <= input; i++) {
            result += i;
        }
        System.out.println("result = " + result);
    }
}
