package com.algorithms.strings;

import static com.algorithms.strings.IsPalindrome.isPalindrome;

public class Main {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse("Hello my name is bob!"));

        Reverse reverse = new Reverse();
        System.out.println(reverse.reverseRecursive("Hello there my name is arthur"));

        String sentence1 = "racecar";
        System.out.println(sentence1);
        System.out.println("Palindrome: " + isPalindrome(sentence1));
        String sentence2 = "bob";
        System.out.println(sentence2);
        System.out.println("Palindrome: " + isPalindrome(sentence2));
        String sentence3 = "mike";
        System.out.println(sentence3);
        System.out.println("Palindrome: " + isPalindrome(sentence3));
    }
}
