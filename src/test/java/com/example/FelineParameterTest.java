package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterTest {

    private final int kittenCounts;

    public FelineParameterTest(int kittenCounts) {
        this.kittenCounts = kittenCounts;
    }

    @Parameterized.Parameters()
    public static Object[][] getKittensArray() {
        return new Object[][]{
                {0},
                {1},
                {7},
        };
    }

    @Test
    public void getKittensWithParameter() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittenCounts);
        assertEquals(kittenCounts, actual);
    }

}