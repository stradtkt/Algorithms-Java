package com.algorithms.arrays;

import static com.algorithms.arrays.FindIndex.findIndex;

public class Main {
    public static void main(String[] args) {


        Average average = new Average();
        int[] arr = new int[]{1, 3, 102};
        System.out.println(average.arrayAverage(arr));

        FindIndex findIndex = new FindIndex();
        int[] arr2 = new int[]{2, 3, 45, 6, 98, 23, 54, 87, 102};
        System.out.println("Index position of 98 is: " + findIndex.findIndex(arr2, 98));



    }
}
