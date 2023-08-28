package com.example.algorithm_test.algo_int;

import com.example.algorithm_test.string.String_01;

import java.util.Scanner;

public class Int_01 {
    // * 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

    public int solution_01(int a, int b) {
        return a + b;
    }

    public int solution_02(int a, int b) {
        return a - b;
    }

    public int solution_03(int a, int b) {
        return a * b;
    }

    public int solution_04(int a, int b) {
        return a / b;
    }

    public int solution_05(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Int_01 T = new Int_01();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(T.solution_01(a, b));
        System.out.println(T.solution_02(a, b));
        System.out.println(T.solution_03(a, b));
        System.out.println(T.solution_04(a, b));
        System.out.println(T.solution_05(a, b));
    }
}
