/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex41;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateList {

    // Read input
    public ArrayList<String>  readLine(String fileName){
        CreateList list = new CreateList();
        ArrayList<String> names = new ArrayList<>();

        String addName;

        // If the file path is valid
        try(Scanner input = new Scanner(Paths.get(fileName))){

            // Read one line at a time
            while(input.hasNextLine()) {

                // Add the line to the ArrayList
                addName = input.nextLine();
                list.addName(addName, names);
            }
        }
        // Check for exceptions
        catch (IOException e) {
            System.out.print("Invalid file name.");
        }

        // Return the ArrayList of names
        return names;
    }

    // Add names to create list
    private void addName(String name, ArrayList<String> names) {
        names.add(name);
    }
}
