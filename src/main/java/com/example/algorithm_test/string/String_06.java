package com.example.algorithm_test.string;

import java.util.Scanner;

public class String_06 {
    // ! 문제
    // * //

    // ! 입력
    // * //

    // ! 출력
    // *

    public String solution(String str) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        String_06 T = new String_06();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int answer = 0;
        for (int i = 0; i < a.length()/2; i++) {
            if(a.charAt(i) != a.charAt(a.length()-i-1)) {
                answer = 2;
                
            } else if (a.charAt(i) == a.charAt(a.length()-i-1)) {
                answer = 1;
            } else {
                answer = 0;
            }
        }
        System.out.println(answer);
    }

}
