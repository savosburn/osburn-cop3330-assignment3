/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex41;

import java.util.ArrayList;
import java.util.Comparator;

public class Calculations {

    // Sort the ArrayList of names in alphabetic order
    public ArrayList<String> alphabetize(ArrayList<String> names) {
        names.sort(Comparator.naturalOrder());
        return names;
    }

    // Determine how many names are in the ArrayList
    public int getSize(ArrayList<String> names) {
        return names.size();
    }
}
