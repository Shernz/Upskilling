package com.leetcode.problem.easy;

/**
 * Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * Example 2:
 *
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * Example 3:
 *
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s.
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        String[] s = {"Hello World", "    ", "awesome", "   fly me   to   the moon  "};
        assert lengthOfLastWord(s[0]) == 5;
        assert lengthOfLastWord(s[1]) == 0;
        assert lengthOfLastWord(s[2]) == 7;
        assert lengthOfLastWord(s[3]) == 4;
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.split("\s+");
        return words[words.length - 1].length();
    }
}
