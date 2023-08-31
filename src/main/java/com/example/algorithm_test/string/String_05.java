package com.example.algorithm_test.string;

import java.util.Scanner;

public class String_05 {
    // ! 문제
    // * // 회문 문제
    /*앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
    문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES",
    회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
    단 회문을 검사할 때 대소문자를 구분하지 않습니다.*/

    // ! 입력
    // * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
    // * gooG

    // ! 출력
    // * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
    // * YES

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
