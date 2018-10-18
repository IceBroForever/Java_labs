package com.rukhailo.strings.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinedStrings {
    List<String> strings;

    public JoinedStrings(){
        this.strings = new ArrayList<String>();
    }

    public JoinedStrings(String [] strings){
        this.strings = new ArrayList<String>(Arrays.asList(strings));
    }

    public String[] getStrings() {
        return this.strings.toArray(new String[0]);
    }

    public void setStrings(String [] strings) {
        if(strings == null) this.strings = new ArrayList<String>();
        else this.strings = new ArrayList<String>(Arrays.asList(strings));
    }

    public String getString(int index) {
        if(index < 0 || index >= this.strings.size())
            throw new IllegalArgumentException("Index " + index + " is out of range");
        return this.strings.get(index);
    }

    public void setString(int index, String string) {
        if(index < 0 || index >= this.strings.size())
            throw new IllegalArgumentException("Index " + index + " is out of range");
        this.strings.set(index, string);
    }

    public void addString(String string) {
        this.strings.add(string);
    }

    public void addString(int index, String string) {
        this.strings.add(index, string);
    }

    public String removeString(int index) {
        return this.strings.remove(index);
    }

    public String join() {
        String result = "";
        for (String str : this.strings) {
            result += str;
        }
        return result;
    }

    public String joinViaStr(String joiner) {
        String result = "";
        int size = this.strings.size();
        for (int i = 0; i < size; i++) {
            result += i == size - 1 ? this.strings.get(i) : this.strings.get(i) + joiner;
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.strings.equals(obj);
    }

    @Override
    public int hashCode() {
        return this.strings.hashCode();
    }
}