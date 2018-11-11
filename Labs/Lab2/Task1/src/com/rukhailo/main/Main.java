package com.rukhailo.main;

import com.rukhailo.cui.*;
import com.rukhailo.strings.*;

public class Main {
    public static void main(String[] args) {
        CUI cui = new CUI();
        Strings strings = cui.askForStrings();
        cui.writeShortestString(strings);
    }
}