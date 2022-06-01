package com.algodaily.technicalInterviewPrep;

import java.util.HashSet;
import java.util.Set;

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
