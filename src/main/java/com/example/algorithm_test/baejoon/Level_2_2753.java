package com.example.algorithm_test.baejoon;

import java.util.Scanner;

public class Level_2_2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        // * 4의 배수
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
