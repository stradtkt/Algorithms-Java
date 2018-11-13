package com.algorithms.strings;

public class ReverseString {

    public static final String SEPARATOR = " ";

    public String reverse(String string) {
        if(string == null) {
            throw new IllegalArgumentException("Input cannot be empty!");
        }
        StringBuilder sb = new StringBuilder();
        String[] words = string.split(SEPARATOR);
        for(int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if(i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
