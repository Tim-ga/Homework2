package com.training.goborov.homework2.homework2_2;

import com.training.goborov.homework2.homework2_2.exeption.IncorrectVariableExeption;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void fibonacciLoopTypeSelection() {
        int[] actual1 = Fibonacci.fibonacciLoopTypeSelection(1, 5);
        int[] actual2 = Fibonacci.fibonacciLoopTypeSelection(2, 5);
        int[] actual3 = Fibonacci.fibonacciLoopTypeSelection(3, 5);

        int[] expected = {0, 1, 1, 2, 3};

        Assert.assertArrayEquals(expected, actual1);
        Assert.assertArrayEquals(expected, actual2);
        Assert.assertArrayEquals(expected, actual3);
    }

    @Test(expected = IncorrectVariableExeption.class)
    public void fibonacciLoopTypeSelectionExeption() {
        Fibonacci.fibonacciLoopTypeSelection(4, 5);
        Fibonacci.fibonacciLoopTypeSelection(0, 5);
    }
}