package com.rukhailo.visitors;

import com.rukhailo.arraywithvisitors.*;

public class ProductOfNumbersBetweenMinAndMax implements Visitor {
    public double visit(ArrayWithVisitor array) {
        double[] numbers = array.getNumbers();

        if (numbers.length == 0)
            throw new AssertionError("Array is empty");

        int indexOfMin = 0;
        int indexOfMax = 0;
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            if (numbers[indexOfMin] > numbers[i])
                indexOfMin = i;
            else if (numbers[indexOfMax] < numbers[i])
                indexOfMax = i;
        }

        double result = 1d;
        int start;
        int end;
        if (indexOfMin < indexOfMax) {
            start = indexOfMin + 1;
            end = indexOfMax;
        } else {
            start = indexOfMax + 1;
            end = indexOfMin;
        }
        for (int i = start; i < end; i++) {
            result *= numbers[i];
        }

        return result;
    }
}