package com.example.algorithm_test.algo_int;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class int_05 {
    // ! 문제
    // * 백준 사이트에서는 int가 아닌 Long을 사용해야한다.

    static int A, B, C;

    public static void main(String[] args) throws Exception {
        InputStreamReader st = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(st);
        String[] i = br.readLine().split(" ");

        A = 0;
        B = 0;
        C = 0;

        A = Integer.parseInt(i[0]);
        B = Integer.parseInt(i[1]);
        C = Integer.parseInt(i[2]);

        System.out.println(A+B+C);
    }

}
