package com.amazon.assessment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.amazon.assessment.PascalTriangleDecryption.getEncryptedNumber;

public class PascalTriangleDecryptionTest {

    @Test
    public void testPascalTriangleDecryption() {
        // write your code here
        assert "04".equals(getEncryptedNumber(Arrays.asList(4, 5, 6, 7)));
    }
}
