package com.zoho.L3interviewPrep;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.zoho.L3interviewPrep.KeepReducingWordLength.keepReducingWordLength;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class KeepReducingWordLengthTest {

    @Test
    public void testKeepReducingWordLength() {
        String[] dictionary = new String[]{"sprint", "print", "pint", "pot", "pat", "pit", "ink", "it", "prit", "I", "Trent", "rent", "ent"};
        assertArrayEquals(keepReducingWordLength("Sprint", dictionary).toArray(), new String[] {"Sprint", "print", "pint", "pit", "it", "i"});
    }
}
