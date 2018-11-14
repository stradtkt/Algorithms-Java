package com.algorithms.strings;

public class IsPalindrome {
    public static boolean isPalindrome(String text) {
        int length = text.length();
        if(length <= 1) {
            return true;
        } else {
            char first = Character.toLowerCase(text.charAt(0));
            char last = Character.toLowerCase(text.charAt(length - 1));
            if(Character.isLetter(first) && Character.isLetter(last)) {
                if(first == last) {
                    String shorter = text.substring(1, length - 1);
                    return isPalindrome(shorter);
                } else {
                    return false;
                }
            } else if(!Character.isLetter(last)) {
                String shorter = text.substring(0, length - 1);
                return isPalindrome(shorter);
            } else {
                String shorter = text.substring(1);
                return isPalindrome(shorter);
            }
        }
    }
}
