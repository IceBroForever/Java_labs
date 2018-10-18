package com.rukhailo.ints.cui;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IntsProvider {
    public int[] getInts() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> ints = new ArrayList<Integer>();

        System.out.print("Write a number and press Enter: ");

        while (true) {
            try {
                String input = br.readLine();
                if (input.equals(""))
                    break;
                ints.add(Integer.parseInt(input));
            } catch (IOException e) {
                System.out.print("io error: " + e);
            } catch (NumberFormatException e) {
                System.out.print("can not convert string to number: " + e);
            }
        }

        return ints.stream().mapToInt(Integer::intValue).toArray();
    }
}