package com.zoho.L3interviewPrep;

import org.junit.jupiter.api.Test;

import static com.zoho.L3interviewPrep.StringSortingByString.sortStringByString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSortingByStringTest {

    @Test
    public void testSortStringByString() {
        assertEquals(sortStringByString("program", "graph"), "grrapom");
    }
}
