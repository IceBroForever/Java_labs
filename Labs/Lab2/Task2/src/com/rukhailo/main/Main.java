package com.rukhailo.main;

import com.rukhailo.cui.*;
import com.rukhailo.arraywithvisitors.ArrayWithVisitor;;

public class Main {
    public static void main(String[] args) {
        CUI cui = new CUI();
        ArrayWithVisitor array = cui.askForNumbers();
        cui.runVisitors(array);
        cui.printSortedArray(array);
    }
}