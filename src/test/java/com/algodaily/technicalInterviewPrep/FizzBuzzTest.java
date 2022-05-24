package com.algodaily.technicalInterviewPrep;

import org.junit.jupiter.api.Test;

import static com.algodaily.technicalInterviewPrep.FizzBuzz.fizzBuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void firstTest() {
        assertEquals(fizzBuzz(1), "1");
    }

    @Test
    public void secondTest() {
        assertEquals(
                fizzBuzz(15),
                "12fizz4buzzfizz78fizzbuzz11fizz1314fizzbuzz"
        );
    }

    @Test
    public void thirdTest() {
        assertEquals(fizzBuzz(0), "");
    }
}
