package com.example.algorithm_test.algo_int;

import java.util.Scanner;

public class int_04 {
    // ! 문제
    // * //

    // ! 입력
    // * //

    // ! 출력
    // *

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;

        a = sc.nextInt();
        b = sc.nextInt();
        c = (b % 10);
        d = (b % 100) / 10;
        e = (b % 1000) / 100;


        System.out.println(a*c);
        System.out.println(a*d);
        System.out.println(a*e);
        System.out.println(a*b);
    }

}
