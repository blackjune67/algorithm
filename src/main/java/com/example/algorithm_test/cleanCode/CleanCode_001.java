package com.example.algorithm_test.cleanCode;

import java.util.Scanner;

public class CleanCode_001 {

    /**
     * clencode 사용자로부터 두개의 숫자를 입력 받아 덧셈 결과를 출력한다.
     * 입력받는 input 메서드의 중복을 따로 메서드로 분리해서 사용한다.
     * */
    public static void main(String[] args) {
        double operand1 = getUserInput("Enter operand1");
        double operand2 = getUserInput("Enter operand2");

        double sum = operand1 + operand2;
        System.out.println("Sum = " + sum);
    }

    private static double getUserInput(String msg) {
        System.out.println("Message = " + msg);
        return new Scanner(System.in).nextDouble();
    }
}
