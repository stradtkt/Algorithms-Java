package com.algorithms.arrays;

public class MinMax {
    static int max;
    static int min;
    public static void minMax(int arr[]) {
        max = arr[0];
        min = arr[0];
        int len = arr.length;
        for(int i = 1; i < len - 1; i += 2) {
            if(i + 1 > len) {
                if(arr[i] > max) {
                    max = arr[i];
                }
                if(arr[i] < min) {
                    min = arr[i];
                }
            }
            if(arr[i] > arr[i + 1]) {
                if(arr[i] > max) {
                    max = arr[i];
                }
                if(arr[i] < min) {
                    min = arr[i];
                }
            }
            if(arr[i] < arr[i + 1]) {
                if(arr[i] < min) {
                    min = arr[i];
                }
                if(arr[i + 1] > max) {
                    max = arr[i + 1];
                }
            }
        }
    }
}
