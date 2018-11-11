package com.rukhailo.cui;

import java.util.Scanner;

import com.rukhailo.strings.*;

public class CUI {
    public Strings askForStrings() {
        Strings strings = new Strings();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write down strings (write empty string to stop):");
        while (true) {
            String str = scanner.nextLine();
            if (str.isEmpty())
                break;
            strings.addString(str);
        }

        return strings;
    }

    public void writeShortestString(Strings strings) {
        String shortest = strings.getShortestString();
        System.out.printf("Shortest string: %s (length: %d)%n", shortest, shortest.length());
    }
}