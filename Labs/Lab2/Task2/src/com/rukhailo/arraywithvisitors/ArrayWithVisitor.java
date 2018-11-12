package com.rukhailo.arraywithvisitors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayWithVisitor {
    List<Double> numbers = new ArrayList<Double>();

    public double[] getNumbers() {
        double[] target = new double[numbers.size()];
        for (int i = 0; i < target.length; i++) {
            target[i] = numbers.get(i);
        }
        return target;
    }

    public double[] getSortedNumbers() {
        double[] numbers = getNumbers();
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (numbers[j] > numbers[j + 1]) {
                    Double temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
        return numbers;
    }

    public void setNumber(double number, int index) {
        numbers.set(index, number);
    }

    public void setNumbers(double[] numbers) {
        this.numbers = new ArrayList<Double>();
        for (double number : numbers) {
            this.numbers.add(number);
        }
    }

    public void addNumber(double number) {
        numbers.add(number);
    }

    public double removeNumber(int index) {
        return ((Double) numbers.remove(index)).doubleValue();
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}