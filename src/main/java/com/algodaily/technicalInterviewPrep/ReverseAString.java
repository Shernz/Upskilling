package com.algodaily.technicalInterviewPrep;

/**
 * Can you write a function that reverses an inputted string without using the built-in Array#reverse method?
 *
 * Let's look at some examples. So, calling:
 *
 * reverseString("jake") should return "ekaj".
 *
 * reverseString("reverseastring") should return "gnirtsaesrever".
 *
 * Constraints
 * Do not use the built-in #reverse() method or [::-1] if Python
 * Ideal solution would run in O(n) time complexity and O(1) space complexity
 */
public class ReverseAString {

    public static String reverseString(String str) {
        StringBuilder reversedString = new StringBuilder();
        for (int index = str.length() - 1;index > -1;index--) {
            reversedString.append(str.charAt(index));
        }
        return reversedString.toString();
    }
}
