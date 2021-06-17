package oop.assignment3.ex41;

import java.util.ArrayList;
import java.util.Comparator;

public class Calculations {
    public ArrayList<String> alphabetize(ArrayList<String> names) {
        names.sort(Comparator.naturalOrder());
        return names;
    }

    public int getSize(ArrayList<String> names) {
        return names.size();
    }
}
