package com.algodaily.technicalInterviewPrep;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.algodaily.technicalInterviewPrep.ArrayIntersection.arrayIntersection;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayIntersectionTest {
    @Test
    public void getArrayIntersection() {
        assertArrayEquals(new Integer[] {}, arrayIntersection(
                new int[] { 6, 0, 12, 10, 16 },
                new int[] { 3, 15, 18, 20, 15 }
        ));
    }

    @Test
    public void singleIntersection() {
        assertArrayEquals(new Integer[]{5}, arrayIntersection(
                new int[]{1, 5, 2, 12, 6},
                new int[]{13, 10, 9, 5, 8}
        ));
    }

    @Test
    public void multipleIntersections() {
        Integer[] result =
                arrayIntersection(
                        new int[] { 4, 17, 4, 4, 15, 16, 17, 6, 7 },
                        new int[] { 15, 2, 6, 20, 17, 17, 8, 4, 5 }
                );
        Integer[] expected = new Integer[] { 15, 6, 17, 4 };
        Arrays.sort(result);
        Arrays.sort(expected);
        assertArrayEquals(expected, result);
    }
}
