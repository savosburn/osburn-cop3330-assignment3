/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex45;

import java.util.ArrayList;

public class WordFinder {

    public ArrayList<String> modifyList(ArrayList<String> paragraph) {
        WordFinder finder = new WordFinder();

        // For every word in the paragraph
        for (int i = 0; i < paragraph.size(); i++) {

            // Determine if the word contains "utilize"
            if (paragraph.get(i).contains("utilize")) {

                // Change "utilize" to "use"
                String newString = finder.utilizeToUse(paragraph, i);
            }
        }

        return paragraph;
    }

    public String utilizeToUse(ArrayList<String> utilize, int i) {
        String master = utilize.get(i);
        String target = "utilize";
        String replacement = "use";

        // Replace "utilize" with "use"
        String processed = master.replace(target, replacement);
        utilize.set(i, processed);

        return utilize.set(i, processed);
    }
}
