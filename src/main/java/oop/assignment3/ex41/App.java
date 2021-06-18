/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex41;

/*
Alphabetizing the contents of a file, or sorting its contents,
is a great way to get comfortable manipulating a file in your program.

Create a program that reads in the following list of names from a
file called `exercise41_input.txt` and sorts the list alphabetically:

Ling, Mai
Johnson, Jimi
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong

Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.

Example Output

Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina

Constraint
Don't hard-code the number of names.
 */

import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        CreateList list = new CreateList();
        Calculations calculations = new Calculations();
        GenerateOutput output = new GenerateOutput();

        // Declare variables
        ArrayList<String> namesList;
        int size;

        String fileName = "exercise41_input.txt";
        String outputFile = "exercise41_output.txt";

        // Sort
        namesList = calculations.alphabetize(list.readLine(fileName));
        size = calculations.getSize(namesList);

        // Output
        System.out.print(output.consoleString(size, namesList));
        output.toFile(namesList, outputFile, size);
    }
}
