package com.example.algorithm_test.string;

import java.util.Scanner;

public class String_05 {
    // ! 문제
    // * //

    // ! 입력
    // * //

    // ! 출력
    // *

    public String solution(String str) {
        String answer = "";

        for (int i = 0; i <str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                return "NO";
            } else {
                answer = "YES";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String_05 T = new String_05();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String s = a.toUpperCase();
        // * gooG
        // * GooG = length 4, -1
        // * gooG g:0, o:1, o:2, G:3
        // * length-i -1,  goog 4-0 = 4 -1 = 3

        System.out.println(T.solution(s));
    }
}
