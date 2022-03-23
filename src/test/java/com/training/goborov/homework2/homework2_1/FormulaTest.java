package com.training.goborov.homework2.homework2_1;

import org.junit.Assert;
import org.junit.Test;

public class FormulaTest {

    @Test
    public void calculation() {
        double actual = Formula.calculation(3, 2, 3.5, 5.6);
        double expected = 29.28344162960579;

        Assert.assertEquals(expected, actual, 0);
    }
}
