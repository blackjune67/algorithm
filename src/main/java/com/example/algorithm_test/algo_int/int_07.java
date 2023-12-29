package com.example.algorithm_test.algo_int;

import java.util.Scanner;

public class int_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열의 길이 입력 받기
        System.out.print("배열의 길이 N을 입력하세요: ");
        int n = scanner.nextInt();
//        scanner.nextLine();
        // 배열의 원소 입력 받기
        int[] arr = new int[n];
        System.out.println("배열의 원소를 입력하세요:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // func2 함수 호출하여 결과 출력
        int result = func2(arr, n);
        System.out.println("결과: " + result);
    }

    // 합이 100이 되는 서로 다른 위치의 두 원소가 존재하는지 확인하는 함수
    static int func2(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == 100) {
                    // 합이 100이면 조건을 만족하므로 1을 반환하고 함수 종료
                    return 1;
                }
            }
        }
//        1 52 48

        // 반복문을 모두 돌았는데도 합이 100인 원소를 찾지 못한 경우 0 반환
        return 0;
    }
}