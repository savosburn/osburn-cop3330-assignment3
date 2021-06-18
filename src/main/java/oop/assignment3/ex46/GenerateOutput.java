package oop.assignment3.ex46;

import java.util.ArrayList;

public class GenerateOutput {

    public String outputString (ArrayList<String> unique, Integer[] freqs) {
        GenerateOutput genOut = new GenerateOutput();

        String output = String.format("%-10s %s\n", unique.get(0) + ": ", genOut.generateStars(freqs[0]));

        for (int i = 1; i < unique.size(); i++) {
            output += String.format("%-10s %s\n", unique.get(i) + ": ", genOut.generateStars(freqs[i]));
        }

        return output;
    }

    public String generateStars(int numStars) {
        String stars = null;

        for (int i = 0; i < numStars; i++) {
            if (stars == null) {
                stars = "*";
            }

            else {
                stars += "*";
            }
        }

        return stars;
    }
}
