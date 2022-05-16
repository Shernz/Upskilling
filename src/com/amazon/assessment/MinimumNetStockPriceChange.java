package com.amazon.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Question: Minimum NetStock Price Change
 *
 * The interns at amazon are given the task to find the earliest month in which the net change in the stock
 * price is minimum from the given array of stock prices of n months. The net change in the price for a month i
 * is defined as the absolute difference in the average of prices till the month i and average of prices for the rest of the months.
 *
 * Given the array of stock prices, find the month that has minimum net change. If there are several such months, return the one that is earliest.
 *
 * Explanation:
 * Input:
 * 5	-> Number of elements
 * 1	-> Stock prices
 * 3
 * 2
 * 4
 * 5
 *
 * Output:
 * 2
 *
 * Explanation:
 * 1. Difference between the avg(1) and avg(the rest) is 3-1 = 2 => month 1
 * 2. Difference between the avg(1, 3) and the rest is 3 - 2 = 1 => month 2
 * 3. Difference between the avg(1, 3, 2) the rest is 4 - 2 = 2 => month 3
 * 4. Difference between the avg(1, 3, 2, 4) and the rest is 5 - 2=3 => month 4
 *
 * Since the month 2 has the minimum net change in the stock price, the answer is 2.
 */

public class MinimumNetStockPriceChange {

    public static void main(String[] args) {
        // write your code here
        List<Integer> minimumNetStockPrice = Arrays.asList(1, 3, 2, 4, 5, 6);

       int earliestMonth = MinimumNetStockPriceChange.findEarliestMonth(minimumNetStockPrice);

       System.out.println("Earliest month - " + earliestMonth);

    }


    public static int findEarliestMonth(List<Integer> stockPrice) {
        List<Integer> sum = new ArrayList<>();
        sum.add(stockPrice.get(0));
        int month = 1;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < stockPrice.size() - 1;i++) {
            sum.add(sum.get(i) + stockPrice.get(i+1));
        }

        int last = sum.size();
        for (int mon = 1; mon < sum.size();mon++) {
            int avg1 = sum.get(mon - 1) / mon;
            int avg2 = (sum.get(last - 1) - sum.get(mon - 1)) / (last - mon);
            int diff = Math.abs(avg1 - avg2);
            if (diff < minimum) {
                minimum = diff;
                month = mon;
            }
        }

        return month;
    }
}
