package com.algorithms.arrays;

public class FindIndex {
    public static int findIndex(int[] arr, int f) {
        if(arr == null) return -1;
        int len = arr.length;
        int i = 0;
        while(i < len) {
            if(arr[i] == f) {
                return i;
            } else {
                i += 1;
            }
        }
        return -1;
    }
}
