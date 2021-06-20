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

        // For every data entry
        for (int i = 1; i < unique.size(); i++) {

            // Add the corresponding amount of stars
            output += String.format("%-9s %s\n", unique.get(i) + ": ", genOut.generateStars(freqs[i]));
        }

        // Return the output
        return output;
    }

    public String generateStars(int numStars) {
        String stars = null;

        // If the number of stars is invalid
        if (checkIfInvalid(numStars)) {

            // Let the user know
            return "Invalid number of stars\n";
        }

        // Otherwise, for every word
        for (int i = 0; i < numStars; i++) {
            // Add the correct number of stars
            stars = testNull(stars);
        }

        return stars;
    }

    public boolean checkIfInvalid(int numStars) {
        // Determine if the stars are an invalid number
        return (numStars < 0);
    }

    public String testNull(String stars) {

        // If the current string is empty
        if (stars == null) {
            // Make the string equal the output
            stars = "*";
        }

        // If the string already has data
        else {
            // Add the new output to the string
            stars += "*";
        }
        return stars;
    }
}
