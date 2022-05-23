package com.algodaily.technicalInterviewPrep;

import org.junit.jupiter.api.Test;

import static com.algodaily.technicalInterviewPrep.MajorityElement.majorityElement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {

    @Test
    public void testMajorityElement() {
        assertEquals(majorityElement(new int[] { 1, 4, 2, 4, 4, 3, 4 }), 4);
        assertEquals(majorityElement(new int[] { 1, 1, 1, 4, 2, 4, 4, 3, 1, 1, 1 }), 1);
    }
}
