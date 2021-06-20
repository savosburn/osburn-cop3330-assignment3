/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex41;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GenerateOutput {

    public void toFile(ArrayList<String> nameList, String outFile, int num){
        GenerateOutput output = new GenerateOutput();

        output.writeToFile(outFile, num, nameList);
    }

    private void writeToFile(String outfile, int num, ArrayList<String> nameList) {
        GenerateOutput output = new GenerateOutput();

        // Make sure that the file is valid
        try(FileWriter outFile = new FileWriter(outfile)) {
            outFile.write(output.numNames(num));
            outFile.write(output.divider());
            outFile.write(output.list(nameList));
        } catch (IOException e) {
            System.out.print("Invalid file name.");
        }
    }

    // Create string to print to console
    public String consoleString(int numNames, ArrayList<String> names) {
        GenerateOutput output = new GenerateOutput();

        return output.numNames(numNames) + output.divider() + output.list(names);
    }

    // Create header
    public String numNames(int names) {
        return String.format("Total of %d names\n", names);
    }

    // Create divider
    public String divider() {
        return "-----------------\n";
    }

    // Create the list of names in string form
    public String list(ArrayList<String> names) {
        StringBuilder nameList = new StringBuilder(names.get(0) + "\n");

        // Loop through every name and add it to the string
        for (int i = 1; i < names.size(); i++) {
            nameList.append(names.get(i)).append("\n");
        }

        return nameList.toString();
    }
}
