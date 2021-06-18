/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
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
        // Prompt for the name of the output file
        // read in the file
        // create an array list of every word
        // loop through the list and find the word "utilize"
        // replace utilize with use
        // reprint the paragraph to the output file
        // reprint the paragraph to the console

        App myApp = new App();
        BuildParagraph paragraphBuilder = new BuildParagraph();
        WordFinder finder = new WordFinder();
        GenerateOutput output = new GenerateOutput();

        String infile = "exercise45_input.txt";

        ArrayList<String> paragraph = new ArrayList<>();

        paragraph = paragraphBuilder.readFile(infile);
        paragraph = finder.modifyList(paragraph);

        String outfile = output.getOutfile();
        output.toConsole(output.createOutputString(paragraph), outfile);


        System.out.print(output.createOutputString(paragraph));
        //System.out.print(paragraph);




    }
}
