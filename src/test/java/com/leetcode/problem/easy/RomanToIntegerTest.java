package com.leetcode.problem.easy;

import org.junit.jupiter.api.Test;

import static com.leetcode.problem.easy.RomanToInteger.romanToInt;

public class RomanToIntegerTest {

    @Test
    public void testRomanToInteger() {
        String[] s = {"MCMXCIV", "CCC"};
        assert romanToInt(s[0]) == 1994;
        assert romanToInt(s[1]) == 300;
    }
}
