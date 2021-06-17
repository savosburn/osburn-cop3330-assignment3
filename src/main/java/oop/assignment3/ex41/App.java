/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
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
        App myApp = new App();
        CreateList list = new CreateList();
        Calculations calculations = new Calculations();
        GenerateOutput output = new GenerateOutput();

        //System.out.print(System. getProperty("user. dir"));

        // Declare the file parameter
        String fileName = "C:/Users/savos/Documents/UCF Fall 2021/COP3330 - Object Oriented Programming/osburn-cop3330-assignment3/src/main/java/oop/assignment3/ex41/exercise41_input.txt";
        String outputFile = "exercise41_output.txt";
        //System.out.print(System. getProperty("user. dir"));

        ArrayList<String> namesList;


        namesList = list.readLine(fileName);

        namesList = calculations.alphabetize(namesList);
        int size = calculations.getSize(namesList);

        System.out.print(size);


        output.consoleString(size, namesList);
        output.toFile(namesList, outputFile, size);





        // read from file           // CreateList
        // add name to ArrayList

        // alphabetize by last name     // Generate Output
        // get total number of names

        // Create output string
        // print to output file         // Print to output file
            // create output file
            //
    }
}
