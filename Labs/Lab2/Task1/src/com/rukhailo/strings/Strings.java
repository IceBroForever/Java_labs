package com.rukhailo.strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Strings {
    private Set<String> strings = new HashSet<String>();

    public Set getStrings() {
        return Collections.unmodifiableSet(strings);
    }

    public void addString(String str) {
        strings.add(str);
    }

    public void removeString(String str) {
        strings.remove(str);
    }

    public String getShortestString() {
        String shortest = null;
        Iterator iter = strings.iterator();
        while (iter.hasNext()) {
            String str = (String) iter.next();
            if (shortest == null || str.length() < shortest.length()) {
                shortest = str;
            }
        }
        return shortest;
    }
}