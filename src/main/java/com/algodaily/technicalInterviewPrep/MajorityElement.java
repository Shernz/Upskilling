package com.algodaily.technicalInterviewPrep;

import java.util.HashMap;
import java.util.Map;

/**
 * Suppose we're given an array of numbers like the following:
 *
 * [4, 2, 4]
 *
 * Could you find the majority element? A majority is defined as "the greater part, or more than half, of the total. It is a subset of a set consisting of more than half of the set's elements."
 *
 * Let's assume that the array length is always at least one, and that there's always a majority element.
 *
 * In the example above, the majority element would be 4.
 *
 * Constraints
 * Length of the array <= 100000
 * The array will always contain integer values between -1000000000 and 1000000000
 * Expected time complexity : O(n)
 * Expected space complexity : O(n)
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        // fill in
        // with solution
        int length = nums.length;
        int majority = nums[0];
        Map<Integer, Integer> numberMapper = new HashMap<>();
        for(int num : nums) {
            numberMapper.put(num, numberMapper.containsKey(num) ? numberMapper.get(num) + 1 : 1);
        }
        for(Integer num : numberMapper.keySet()){
            int currentValue = numberMapper.get(num);
            if (currentValue > (length/2) && numberMapper.get(majority) < currentValue) {
                majority = num;
            }
        }
        return majority;
    }
}
