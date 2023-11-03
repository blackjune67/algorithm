package com.example.algorithm_test.algorithm;

public class Greedy {
    public static void main(String[] args) {
        int n = 1260;
        int count = 0;
        int[] coin_type = {500, 100, 50, 10};

        for (int i = 0; i < coin_type.length; i++) {
            /*count += n;
            n %= coin_type.length;*/
            int coin = coin_type[i];
            count += n / coin;
            n %= coin;
        }
        System.out.println("count = " + count);
    }
}
