package com.rukhailo.visitors;

import com.rukhailo.arraywithvisitors.*;

public class SumOfNegativeVisitor implements Visitor {
    public double visit(ArrayWithVisitor array) {
        double[] numbers = array.getNumbers();

        if (numbers.length == 0)
            throw new AssertionError("Array is empty");

        double result = 0;
        for (double number : numbers) {
            if (number < 0) {
                result += number;
            }
        }

        return result;
    }
}