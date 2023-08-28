package com.example.algorithm_test.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class String_03 {
    // ! 문제
    // * //

    // ! 입력
    // * ksekkset

    // ! 출력
    // *

    public String solution(String str) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        String_03 T = new String_03();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == -1) {
                answer += str.charAt(i);
            }
        }
        System.out.println("answer = " + answer);
    }
}
