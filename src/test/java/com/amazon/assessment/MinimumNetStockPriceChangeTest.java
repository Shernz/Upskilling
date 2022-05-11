package test.java.com.amazon.assessment;

import com.amazon.assessment.MinimumNetStockPriceChange;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MinimumNetStockPriceChangeTest {

    @Test
    public void testMinimumNetStockPriceChange() {
        assert MinimumNetStockPriceChange.findEarliestMonth(Arrays.asList(1, 3, 2, 4, 5, 6)) == 2;
    }
}
