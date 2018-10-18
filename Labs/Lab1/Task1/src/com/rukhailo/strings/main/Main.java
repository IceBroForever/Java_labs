package com.rukhailo.strings.main;

import com.rukhailo.strings.util.*;

public class Main {
    public static void main(String[] args) {
        JoinedStrings strs = new JoinedStrings(new String [] {
            "First",
            "Second"
        });
        strs.addString("Third");

        System.out.println("Plain joining: " + strs.join());
        System.out.println("Joining via new line: " + strs.joinViaStr("\n"));
    }
}