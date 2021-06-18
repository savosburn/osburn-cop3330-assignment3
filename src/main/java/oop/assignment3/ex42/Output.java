/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex42;

import java.io.FileWriter;
import java.io.IOException;

public class Output {

    // Print to the outfile
    public void printTxt(String outFile, String outputData){
        try(FileWriter outfile = new FileWriter(outFile)) {
            outfile.write(outputData);
        }
        catch (IOException e) {
            System.out.print("Invalid file name.");
        }
    }
}
