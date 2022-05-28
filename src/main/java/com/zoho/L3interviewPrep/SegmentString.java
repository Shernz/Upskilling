package com.zoho.L3interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given dictionary. Given concatenated string. Split in different parts to check for segments
 * Ilikesamsung
 * I like Sam sung or I like Samsung
 */
public class SegmentString {
    public static List<String> segmentString(String word, String[] dictionary) {
        List<String> result = new ArrayList<>();
        int i = 0, j = 1;
        while (j <= word.length()) {
            String wordToCheck = word.substring(i, j);
            if (isPresent(wordToCheck, dictionary)) {
                result.add(wordToCheck);
                i = j++;
            } else j++;
        }
        return result;
    }

    private static boolean isPresent(String substring, String[] dictionary) {
        return Arrays.stream(dictionary).filter(word -> word.equalsIgnoreCase(substring)).count() > 0;
    }
}
