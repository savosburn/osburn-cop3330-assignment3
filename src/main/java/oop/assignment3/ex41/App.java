/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex41;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        CreateList list = new CreateList();
        Calculations calculations = new Calculations();
        GenerateOutput output = new GenerateOutput();

        // Declare variables
        ArrayList<String> namesList;
        int size;

        // Get the file names
        String fileName = "exercise41_input.txt";
        String outputFile = "exercise41_output.txt";

        // Sort
        namesList = calculations.alphabetize(list.readLine(fileName));
        size = calculations.getSize(namesList);

        // Print output to file and console
        System.out.print(output.consoleString(size, namesList));
        output.toFile(namesList, outputFile, size);
    }
}
