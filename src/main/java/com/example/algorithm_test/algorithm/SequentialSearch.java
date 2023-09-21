package com.example.algorithm_test.algorithm;

import java.util.Scanner;

// * 순차검색알고리즘
public class SequentialSearch {
    public static void main(String[] args) {
        int[] dataArray = {4, 21, 2, 10, 11, 16, 5};
        System.out.println("검색할 데이터를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int search = Integer.parseInt(sc.nextLine().trim());

        int result = sequentialSearch(dataArray, search);

        if(result == -1) {
            System.out.println("데이터를 찾지 못 했습니다");
        } else {
            System.out.println("result = " + result + "번째 입니다");
        }
    }

    public static int sequentialSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;
    }
}