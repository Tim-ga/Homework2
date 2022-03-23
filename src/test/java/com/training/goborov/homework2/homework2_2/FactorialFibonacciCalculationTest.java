package com.training.goborov.homework2.homework2_2;

import com.training.goborov.homework2.homework2_2.exeption.IncorrectVariableExeption;
import org.junit.Assert;
import org.junit.Test;

public class FactorialFibonacciCalculationTest {

    @Test
    public void calculation() {
        String actual1 = FactorialFibonacciCalculation.algorithmIdSelection(1, 1, 5);
        String actual2 = FactorialFibonacciCalculation.algorithmIdSelection(2, 1, 5);

        Assert.assertEquals("120", actual1);
        Assert.assertEquals("[0, 1, 1, 2, 3]", actual2);
    }

    @Test(expected = IncorrectVariableExeption.class)
    public void calculationExeption() {
        FactorialFibonacciCalculation.algorithmIdSelection(3, 1, 5);
    }
}