package com.zoho.L3interviewPrep;

import org.junit.jupiter.api.Test;

import static com.zoho.L3interviewPrep.SegmentString.segmentString;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SegmentStringTest {

    @Test
    public void testSegmentString() {
        assertArrayEquals(segmentString("Ilikesamsung", new String[]{"I", "like", "Samsung", "Sam", "sung"}).toArray(), new String[]{"I", "like", "sam", "sung"});
    }
}
