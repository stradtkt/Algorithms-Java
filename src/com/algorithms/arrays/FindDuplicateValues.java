package com.algorithms.arrays;

public class FindDuplicateValues {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5,6,7,8,8,9,0,0};
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if((arr[i] == arr[j]) && (i != j)) {
                    System.out.println("Duplicate element: " + arr[j]);
                }
            }
        }
    }
}
