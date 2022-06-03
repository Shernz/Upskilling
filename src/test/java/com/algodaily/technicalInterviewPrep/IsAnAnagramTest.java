package com.algodaily.technicalInterviewPrep;

import org.junit.jupiter.api.Test;

import static com.algodaily.technicalInterviewPrep.IsAnAnagram.isAnagram;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsAnAnagramTest {

    @Test
    public void firstTest() {
        assertEquals(isAnagram("Mary", "Army"), true);
    }

    @Test
    public void secondTest() {
        assertEquals(isAnagram("cinema", "iceman"), true);
    }

    @Test
    public void thirdTest() {
        assertEquals(isAnagram("jake", "jay"), false);
    }

}
