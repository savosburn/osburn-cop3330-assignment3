/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex45;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GenerateOutput {
    private static final Scanner in = new Scanner(System.in);

    public String createOutputString(ArrayList<String> paragraph) {
        // Assign the output to the first word in the paragraph
        String output = paragraph.get(0) + " ";

        // For every word (other than the first) in the paragraph, add it to the output string
        for (int i = 1; i < paragraph.size(); i++) {
            output += paragraph.get(i) + " ";
        }

        return output;
    }

    public String getOutfile() {
        // Ask user for the outfile name
        System.out.print("What is the name of your outfile? ");
        return in.nextLine();
    }

    public void toOutfile(String output, String outfile) {

        // If it's a valid outfile
        try(FileWriter outFile = new FileWriter(outfile)) {
            // Print to the outfile
            outFile.write(output);
        } catch (IOException e) {
            System.out.print("Invalid outfile.");
        }
    }
}
