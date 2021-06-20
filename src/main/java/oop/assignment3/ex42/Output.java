/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex42;

import java.io.FileWriter;
import java.io.IOException;

public class Output {

    public void printTxt(String outFile, String outputData){

        // If the file is valid
        try(FileWriter outfile = new FileWriter(outFile)) {

            // Print ot the output file
            outfile.write(outputData);
        }
        catch (IOException e) {

            // Otherwise, state that the file was invalid
            System.out.print("Invalid file name.");
        }
    }
}
