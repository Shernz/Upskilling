package com.amazon.assessment;

import java.util.Arrays;
import java.util.List;

/**
 * Question: Pascal Triangle Decryption
 *
 * We at amazon value our customers and their continued trust, hence to keep that intact we save their data
 * with utmost security. We use the pascal triangle algorithm which adds the adjacent elements and takes the
 * least significant bit for further addition. We continue the process until the 2 digit message is obtained.
 * Given an array of numbers, decrypt the hidden message as a single string in them using the pascal triangle algorithm.
 *
 * Example :
 * Input -
 * 4	-> Number of elements
 * 4	-> Elements
 * 5
 * 6
 * 7
 *
 * Output:
 * 04
 *
 * Explanation:
 * 1. Adding 4 and 5 gives 9, 5 and 6 gives 11 and 6 and 7 gives 13
 * 2. Since we want only the LSB we take 9, 1, and 3 as the next set of numbers for the process
 * 3. Repeating the addition we get 0 and 4 which is our message.
 */


public class PascalTriangleDecryption {

    public static String getEncryptedNumber(List<Integer> numbers) {
        // Write your code here

        Integer[] summedNos = numbers.toArray(new Integer[numbers.size()]);

        summedNos = pascalTriangle(summedNos, summedNos.length);
        return Integer.toString(summedNos[0]).concat(Integer.toString(summedNos[1]));
    }

    private static Integer[] pascalTriangle(Integer[] summedNos, int size) {

        if (size == 2) {
            return summedNos;
        }

        for (int i = 0;i < size - 1;i++) {
            summedNos[i] = (summedNos[i] + summedNos[i + 1]) % 10;
        }
        summedNos = pascalTriangle(summedNos, size - 1);
        return summedNos;
    }
}
