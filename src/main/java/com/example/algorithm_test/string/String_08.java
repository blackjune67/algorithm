package com.example.algorithm_test.string;

import java.util.Scanner;

public class String_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.toUpperCase().replaceAll("[^A-Z]", ""); // * 알파벳만 갖게끔
        String s2 = new StringBuffer(s1).reverse().toString();
        if (s1.equals(s2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
