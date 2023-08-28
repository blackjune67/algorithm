package com.example.algorithm_test.string;

import java.util.Scanner;

public class String_01 {

    public String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if(!Character.isAlphabetic(c[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(c[rt])) {
                rt--;
            } else {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);

        return answer;
    }

    public static void main(String[] args) {
        String_01 T = new String_01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("str = " + T.solution(str));
    }
}
