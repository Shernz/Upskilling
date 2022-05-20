package com.algodaily.technicalInterviewPrep;

import org.junit.jupiter.api.Test;

import static com.algodaily.technicalInterviewPrep.ReverseAString.reverseString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseAStringTest {

    @Test
    public void testReverseAString() {
        assertEquals(reverseString("timbuktu12"), "21utkubmit");
        assertEquals(reverseString("njnschnjkdasn j32 uida"), "adiu 23j nsadkjnhcsnjn");
    }
}
