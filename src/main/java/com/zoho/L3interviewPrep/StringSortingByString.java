package com.zoho.L3interviewPrep;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * String order based sorting. Sort string 1 based on the order of string 2. If character in string2 not in string 1 attach to end.
 * S1 program, Tendulkar
 * S2 graph, sharuk
 * O grrapom, aruktendl
 */
public class StringSortingByString {
    public static String sortStringByString(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> s1Characters = new LinkedHashMap<>();
        for(Character c : s1.toCharArray()) {
            s1Characters.put(c, s1Characters.getOrDefault(c, 0) + 1);
        }

        for(int i = 0;i < s2.length() && !s1Characters.isEmpty();i++) {
            char c = s2.charAt(i);
            if(s1Characters.containsKey(c)) {
                int val = s1Characters.get(c);
                result.append(appendCharacters(val, c));
                s1Characters.remove(c);
            }
        }

        for(Character c : s1Characters.keySet()) {
            int val = s1Characters.get(c);
            result.append(appendCharacters(val, c));
        }

        return result.toString();
    }

    private static String appendCharacters(int val, char c) {
        StringBuilder result = new StringBuilder();
        if (val > 1)
            while(val > 0) {
                result.append(c);
                val--;
            }
        else result.append(c);
        return result.toString();
    }
}
