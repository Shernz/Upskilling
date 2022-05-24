package com.algodaily.technicalInterviewPrep;

import java.util.HashSet;
import java.util.Set;

/**
 * Can you write a function that takes two arrays as inputs and returns to us their intersection?
 * We can call the method intersection. Let's return the intersection of the two inputs in the form of an array.
 * As a reminder, the definition of an intersection of two sets A and B is the set containing all elements of A that also belong to B
 * (or equivalently, all elements of B that also belong to A).
 *
 * Note that all elements in the final result should be unique. Here's one example:
 * const nums1 = [1, 2, 2, 1];
 * const nums2 = [2, 2];
 *
 * intersection(nums1, nums2);
 * // [2]
 *
 *
 * const nums1 = [4,9,5];
 * const nums2 = [9,4,9,8,4];
 *
 * intersection(nums1, nums2);
 * // [9, 4]
 *
 * Constraints
 * Length of the array <= 100000
 * The values in the array will be in the range -1000000000 and 1000000000
 * Expected time complexity: O(n+m) where n and m are the lengths of the array.
 * Expected space complexity: O(max(n,m)).
 */
public class ArrayIntersection {
    public static Integer[] arrayIntersection(int[] arr1, int[] arr2) {
        // fill in
        Set<Integer> intersection = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int num : arr1)
            intersection.add(num);

        for(int num : arr2)
            if (intersection.contains(num))
                result.add(num);

        return result.stream().toArray(Integer[] :: new);
    }
}
