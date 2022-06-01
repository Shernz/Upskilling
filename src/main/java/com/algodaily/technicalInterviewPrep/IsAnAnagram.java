package com.algodaily.technicalInterviewPrep;

import java.util.HashSet;
import java.util.Set;

/**
 * Here's the definition of an anagram: a word, phrase, or name formed by rearranging the letters of another: such as cinema, formed from iceman.
 *
 * We are given two strings like "cinema" and "iceman" as inputs. Can you write a method isAnagram(str1, str2) that will return true or false depending on whether the strings are anagrams of each other?
 *
 * Constraints
 * Length of both the strings <= 100000
 * The strings will contain only alphanumeric characters (a-z , A-Z, 0-9)
 * The strings can be empty
 * Expected time complexity : O(nlogn)
 * Expected space complexity : O(n)
 */

public class IsAnAnagram {
    public static boolean isAnagram(String inputA, String inputB) {
        // fill in
        // with solution
        inputA = inputA.toLowerCase();
        inputB = inputB.toLowerCase();
        Set<Character> inputSetA = new HashSet<>();
        for(char input : inputA.toCharArray()){
            inputSetA.add(input);
        }
        boolean doesItContain = true;
        for (char input : inputB.toCharArray()) {
            doesItContain = doesItContain && inputSetA.contains(input);
        }
        return doesItContain;
    }
}
