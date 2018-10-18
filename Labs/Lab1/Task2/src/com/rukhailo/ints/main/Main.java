package com.rukhailo.ints.main;

import com.rukhailo.ints.cui.*;
import com.rukhailo.ints.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntsProvider provider = new IntsProvider();

        int[] ints = provider.getInts();

        ArrayWithParity array = new ArrayWithParity(ints);

        System.out.println("Even numbers: " + Arrays.toString(array.getEvenInts()));
        System.out.println("Odd numbers: " + Arrays.toString(array.getOddInts()));
    }
}