package com.example.algorithm_test.baejoon;

import java.util.Scanner;

public class Level_2_2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        // * 4의 배수이면서 100의 배수가 아니면 윤년
        // * 1999년은 100의 배수, 400의 배수는 아니기 때문에 윤년
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
