package com.example.algorithm_test.string;

import java.util.Scanner;

public class String_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(); // 한 줄을 받기 위해서 nextLine

        String s = a.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(s).reverse().toString();

        if(s.equals(temp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
