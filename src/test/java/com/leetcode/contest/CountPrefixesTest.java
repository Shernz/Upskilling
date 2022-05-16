package com.leetcode.contest;

import org.junit.jupiter.api.Test;

import static com.leetcode.contest.CountPrefixes.countPrefixes;

public class CountPrefixesTest {

    @Test
    public void testCountPrefixes() {
        String[][] words = {{"a", "b", "c", "ab", "bc", "abc"}, {}, {"abcdefgh", "abcdefgv"}};
        String[] s = {"abc", "", "abcdefghikl"};

        assert countPrefixes(words[0], s[0]) == 3;
        assert countPrefixes(words[1], s[1]) == 0;
        assert countPrefixes(words[2], s[2]) == 0;
    }
}
