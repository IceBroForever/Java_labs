package com.rukhailo.ints.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayWithParity {
    List<Integer> ints;

    public ArrayWithParity() {
        this.ints = new ArrayList<Integer>();
    }

    public ArrayWithParity(int[] ints) {
        this.ints = this.arrayToList(ints);
    }

    public int[] getInts() {
        return this.listToArray((ArrayList) this.ints);
    }

    public void setInts(int[] ints) {
        if (ints == null)
            this.ints = new ArrayList<Integer>();
        else
            this.ints = this.arrayToList(ints);
    }

    public int getInt(int index) {
        if (index < 0 || index >= this.ints.size())
            throw new IllegalArgumentException("Index " + index + " is out of range");
        return this.ints.get(index).intValue();
    }

    public void setInt(int index, int integer) {
        if (index < 0 || index >= this.ints.size())
            throw new IllegalArgumentException("Index " + index + " is out of range");
        this.ints.set(index, integer);
    }

    public void addInt(int integer) {
        this.ints.add(integer);
    }

    public void addInt(int index, int integer) {
        this.ints.add(index, integer);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.ints.equals(obj);
    }

    public int[] getEvenInts() {
        ArrayList<Integer> even = new ArrayList<>();
        for (int integer : this.ints) {
            if (integer % 2 == 0)
                even.add(integer);
        }
        return this.listToArray(even);
    }

    public int[] getOddInts() {
        ArrayList<Integer> odd = new ArrayList<>();
        for (int integer : this.ints) {
            if (integer % 2 != 0)
                odd.add(integer);
        }
        return this.listToArray(odd);
    }

    @Override
    public int hashCode() {
        return this.ints.hashCode();
    }

    @Override
    public String toString() {
        return this.ints.toString();
    }

    List<Integer> arrayToList(int[] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int integer : array)
            list.add(integer);
        return list;
    }

    int[] listToArray(ArrayList<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}