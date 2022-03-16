package com.training.goborov.homework2.homework2_2;

import com.training.goborov.homework2.homework2_2.exeption.IncorrectVariableExeption;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void factorialLoopTypeSelection() {
        int actual1 = Factorial.factorialLoopTypeSelection(1, 5);
        int actual2 = Factorial.factorialLoopTypeSelection(2, 5);
        int actual3 = Factorial.factorialLoopTypeSelection(3, 5);

        Assert.assertEquals(120, actual1);
        Assert.assertEquals(120, actual2);
        Assert.assertEquals(120, actual3);
    }

    @Test(expected = IncorrectVariableExeption.class)
    public void factorialLoopTypeSelectionExeption() {
        Factorial.factorialLoopTypeSelection(4, 5);
        Factorial.factorialLoopTypeSelection(0, 5);
    }
}