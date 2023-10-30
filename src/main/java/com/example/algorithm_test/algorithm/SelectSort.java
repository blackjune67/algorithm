package com.example.algorithm_test.algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SelectSort {
    public static void main(String[] args) {
        int[] dataList = {15, 6, 9, 10, 2};
        int temp;
        int lowest; // * 작은 값을 기억할 변수

        for (int i = 0; i < dataList.length - 1; i++) { // * 작은 값을 찾는다 (인덱스는 0부터 접근)
            lowest = i;
            for (int j = i + 1; j < dataList.length; j++) { // * 자리를 바꿀 for 문
                if (dataList[lowest] > dataList[j]) { // * 작은값과 배열에 있는 값을 비교한다
                    lowest = j;
                }
            }

            temp = dataList[lowest];
            dataList[lowest] = dataList[i];
            dataList[i] = temp;
        }
        System.out.println("return = " + Arrays.toString(dataList));
    }
}
