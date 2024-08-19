package com.phaete;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 45;
        int number3 = 17;
        int number4 = 90;
        // not flexible, let's use an array!
        int[] coinbox = {1, 45, 17, 90};
        // access array elements with its index, starting with 0
        System.out.println(coinbox[2]);
        // arrays are mutable
        coinbox[0] = 0;
        System.out.println(coinbox[0]);
        // arrays can be initialized in a different manner
        int[] coinbox2 = new int[5]; // a new and empty array with 5 slots, all values initialized with 0
        System.out.println(Arrays.toString(coinbox2));

        // to access all elements in a sequence, use a for loop
        for (int i = 0; i<coinbox.length; i++) {
            System.out.println(coinbox[i]);
        }

        // for each to simplify
        for(int coin : coinbox) {
            System.out.println(coin);
        }

    }
}