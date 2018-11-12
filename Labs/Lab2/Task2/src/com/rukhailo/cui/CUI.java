package com.rukhailo.cui;

import java.util.Scanner;

import com.rukhailo.arraywithvisitors.ArrayWithVisitor;
import com.rukhailo.visitors.*;

public class CUI {
    public ArrayWithVisitor askForNumbers() {
        ArrayWithVisitor array = new ArrayWithVisitor();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write down numbers (write empty string to stop):");
        while (true) {
            String str = scanner.nextLine();
            if (str.isEmpty())
                break;
            try {
                array.addNumber(Double.parseDouble(str));
            } catch (NumberFormatException error) {
                System.out.println(error.getMessage());
            }
        }

        return array;
    }

    public void runVisitors(ArrayWithVisitor array) {
        System.out.printf("Sum of negative numbers: %f%n", array.accept(new SumOfNegativeVisitor()));
        System.out.printf("Product of numbers between min and max element: %f%n",
                array.accept(new ProductOfNumbersBetweenMinAndMax()));
    }

    public void printSortedArray(ArrayWithVisitor array) {
        double[] sortedArray = array.getSortedNumbers();
        System.out.println("Sorted array: ");
        int n = sortedArray.length;
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArray[i]);
            if (i != n - 1)
                System.out.print(", ");
        }
        System.out.println();
    }
}