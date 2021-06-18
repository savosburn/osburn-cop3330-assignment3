/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex41;

import java.util.ArrayList;
import java.util.Comparator;

public class Calculations {

    // Sort the names alphabetically by last name
    public ArrayList<String> alphabetize(ArrayList<String> names) {
        names.sort(Comparator.naturalOrder());
        return names;
    }

    // Get the number of names to prevent hardcoding
    public int getSize(ArrayList<String> names) {
        return names.size();
    }
}
