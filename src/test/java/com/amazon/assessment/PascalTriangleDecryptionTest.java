package com.amazon.assessment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.amazon.assessment.PascalTriangleDecryption.*;

public class PascalTriangleDecryptionTest {

    @Test
    public void testPascalTriangleDecryption() {
        // write your code here
        assert getEncryptedNumber(Arrays.asList(4, 5, 6, 7)) == "04";
    }
}
