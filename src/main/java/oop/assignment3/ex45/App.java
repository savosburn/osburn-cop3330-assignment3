/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex45;

/*
There will be times when you'll need to read in one file, modify it,
and then write a modified version of that file to a new file.

Given an input file named `exercise45_input.txt`, read the file and look for
all occurrences of the word utilize. Replace each occurrence with use.
Write the modified file to a new file.

Example Output
Given the input file of

One should never utilize the word "utilize" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
utilizes an IDE to write her Java programs".

The program should generate

One should never use the word "use" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
uses an IDE to write her Java programs".
Constraints
Prompt for the name of the output file.
Write the output to a new file.
 */

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
