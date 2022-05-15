package com.amazon.assessment;

import static com.amazon.assessment.MinimumNetStockPriceChange.findEarliestMonth;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MinimumNetStockPriceChangeTest {

    @Test
    public void testMinimumNetStockPriceChange() {
        assert findEarliestMonth(Arrays.asList(1, 3, 2, 4, 5, 6)) == 2;
    }
}
