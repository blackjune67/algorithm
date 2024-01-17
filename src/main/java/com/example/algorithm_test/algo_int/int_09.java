package com.example.algorithm_test.algo_int;

import java.util.Scanner;

public class int_09 {
    // * N이하의 수 중에서 가장 큰 2의 거듭제곱수를 반환하는 함수를 만들어라
    public static int solution(int num) {
        int val = 1;
        while (2*val <= num) {
            val *= 2;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = solution(number);
        System.out.println("결과 : " + result);
    }
}
