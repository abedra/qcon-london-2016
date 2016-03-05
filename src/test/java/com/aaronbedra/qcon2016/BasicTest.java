package com.aaronbedra.qcon2016;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasicTest {
    @Test
    public void TestCalculate() {
        assertEquals(Integer.valueOf(5), Basic.calculate(3, 2));
    }
}
