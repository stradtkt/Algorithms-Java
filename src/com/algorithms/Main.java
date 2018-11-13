package com.algorithms;

import com.algorithms.strings.Reverse;
import com.algorithms.strings.ReverseString;

public class Main {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse("Hello my name is bob!"));

        Reverse reverse = new Reverse();
        System.out.println(reverse.reverseRecursive("Hello there my name is arthur"));
    }
}
