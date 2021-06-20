/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex45;

import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        BuildParagraph paragraphBuilder = new BuildParagraph();
        WordFinder finder = new WordFinder();
        GenerateOutput output = new GenerateOutput();

        // Supply user with the input file
        String infile = "exercise45_input.txt";

        // Generate the paragraph with the modified words
        ArrayList<String> paragraph = finder.modifyList(paragraphBuilder.readFile(infile));

        // Output the data to the outfile and the console
        String outfile = output.getOutfile();
        output.toOutfile(output.createOutputString(paragraph), outfile);

        System.out.print(output.createOutputString(paragraph));
    }
}
