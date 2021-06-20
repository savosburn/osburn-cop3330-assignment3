/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex46;

import java.util.ArrayList;

public class GenerateOutput {

    public String outputString (ArrayList<String> unique, Integer[] freqs) {
        GenerateOutput genOut = new GenerateOutput();

        // Generate the first output data
        String output = String.format("%-9s %s\n", unique.get(0) + ": ", genOut.generateStars(freqs[0]));

        // Loop through the rest and add it to the output string
        for (int i = 1; i < unique.size(); i++) {
            output += String.format("%-9s %s\n", unique.get(i) + ": ", genOut.generateStars(freqs[i]));
        }

        // Return the output
        return output;
    }

    public String generateStars(int numStars) {
        String stars = null;

        if (checkIfInvalid(numStars)) {
            return "Invalid number of stars\n";
        }

        // Add a star for each word as necessary
        for (int i = 0; i < numStars; i++) {
            stars = testNull(stars);
        }

        return stars;
    }

    public boolean checkIfInvalid(int numStars) {
        return (numStars < 0);
    }

    // Determines if the string is null so that user can either set equal to or add to string
    public String testNull(String stars) {
        if (stars == null) {
            stars = "*";
        }

        else {
            stars += "*";
        }
        return stars;
    }
}
