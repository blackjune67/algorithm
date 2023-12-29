package com.example.algorithm_test.algo_int;

import java.util.Scanner;

public class int_08 {

    static int solution(int number) {
        for (int i = 1; i * i <= number; i++) {
            if( i * i == number) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = solution(number);
        System.out.println("결과 : " + result);
    }
}
