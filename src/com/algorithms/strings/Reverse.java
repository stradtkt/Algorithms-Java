package com.algorithms.strings;

public class Reverse {

    public String reverseIterable(String input) {
        validateInput(input);
        StringBuilder sb = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
    private void validateInput(String input) {
        if(input == null) {
            throw new IllegalArgumentException("You can't pass an empty string as a parameter");
        }
    }
    private String reverseRecursiveInner(String input, int i, StringBuilder sb) {
        if(i < 0) {
            return sb.toString();
        } else {
            sb.append(input.charAt(i--));
            return reverseRecursiveInner(input, i, sb);
        }
    }

    public String reverseRecursive(String input) {
        validateInput(input);
        return reverseRecursiveInner(input, input.length() - 1, new StringBuilder());
    }
}
