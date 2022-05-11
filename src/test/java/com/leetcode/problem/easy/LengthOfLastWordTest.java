package com.leetcode.problem.easy;

import org.junit.jupiter.api.Test;

import static com.leetcode.problem.easy.LengthOfLastWord.lengthOfLastWord;

public class LengthOfLastWordTest {

    @Test
    public void testLengthOfLastWord() {
        String[] s = {"Hello World", "    ", "awesome", "   fly me   to   the moon  "};
        assert lengthOfLastWord(s[0]) == 5;
        assert lengthOfLastWord(s[1]) == 0;
        assert lengthOfLastWord(s[2]) == 7;
        assert lengthOfLastWord(s[3]) == 4;
    }
}
