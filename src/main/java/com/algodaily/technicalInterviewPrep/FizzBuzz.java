package com.algodaily.technicalInterviewPrep;

/**
 * Fizz Buzz is a classic interview question that apparently many experienced engineering candidates often can't solve! Let's cover it today.
 *
 * We're given a number in the form of an integer n.
 *
 * Write a function that returns the string representation of all numbers from 1 to n based on the following rules:
 *
 * If it's a multiple of 3, represent it as "fizz".
 *
 * If it's a multiple of 5, represent it as "buzz".
 *
 * If it's a multiple of both 3 and 5, represent it as "fizzbuzz".
 *
 * If it's neither, just return the number itself.
 *
 * As such, calling fizzBuzz(15) would result in '12fizz4buzzfizz78fizzbuzz11fizz1314fizzbuzz'.
 *
 * Constraints
 * Maximum value of Integer n <= 1000
 * n will always be a positive integer, but can be 0
 * Expected time complexity : O(n)
 * Expected space complexity : O(1)
 */
public class FizzBuzz {
    public static String fizzBuzz(Integer num) {
        // fill in
        // with solution
        StringBuilder result = new StringBuilder();

        for (int n = 1;n < num + 1;n++) {
            String toAppend;
            if (n % 15 == 0) toAppend = "fizzbuzz";
            else if (n % 5 == 0) toAppend =  "buzz";
            else if (n % 3 == 0) toAppend = "fizz";
            else toAppend = Integer.toString(n);
            result.append(toAppend);
        }
        return result.toString();
    }
}
