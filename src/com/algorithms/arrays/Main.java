package com.algorithms.arrays;

import java.util.Arrays;

import static com.algorithms.arrays.FindIndex.findIndex;

public class Main {
    public static void main(String[] args) {


        Average average = new Average();
        int[] arr = new int[]{1, 3, 102};
        System.out.println(average.arrayAverage(arr));

        FindIndex findIndex = new FindIndex();
        int[] arr2 = new int[]{2, 3, 45, 6, 98, 23, 54, 87, 102};
        System.out.println("Index position of 98 is: " + findIndex.findIndex(arr2, 98));

        MinMax min_max = new MinMax();
        int[] arr3 = new int[]{22,122,32,43,54,56,1989};
        min_max.minMax(arr3);
        System.out.println("Original array: " + Arrays.toString(arr3));
        System.out.println("Maximum value for the array above is: " + min_max.max);
        System.out.println("Minimum value for the array above is: " + min_max.min);

    }
}
