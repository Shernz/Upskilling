package com.leetcode.contest;

/**
 * You are given a string array words and a string s, where words[i] and s comprise only of lowercase English letters
 * Return the number of strings in words that are prefix of s
 * A prefix of a string is a substring that occurs at the beginning of the string. A substring is a contiguous sequence of characters within a string.
 *
 * Example 1:
 * Input: words = ["a", "b", "c", "ab", "bc", "abc"], s = "abc"
 * Output: 3
 * Explanation:
 * The strings in words which are prefix of s = "abc" are
 * "a", "ab" and "abc"
 * Hence 3
 *
 * Example 2:
 * Input: words = ["a", "a"], s = "aa"
 * Output: 2
 * Explanation:
 * Both of the strings are a prefix of s
 *
 * Note that the same string can occur multiple times in words, and it should be counted each time
 *
 * Contraints:
 * * 1 <= words.length <= 1000
 * * 1 <= words[i].length, s.length <= 10
 * * words[i] and s consist of lowercase English letters only
 */
public class CountPrefixes {

    public static int countPrefixes(String[] words, String s) {
        if (words.length < 1 || words.length > 1000 || s.length() > 10 || s.length() < 1) {
            return 0;
        }

        int matches = 0;
        for(String word : words) {
            if (word.length() < 11 && s.startsWith(word) && s.contains(word)) {
                matches++;
            }
        }


        return matches;
    }
}
