/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex42;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateList {

    // Read from file
    public ArrayList<String> readFile(String infile){
        CreateList list = new CreateList();
        ArrayList<String> names = new ArrayList<>();

        String addName;

        // If the file path is valid
        try(Scanner input = new Scanner(Paths.get(infile))){

            // Read line by line
            while(input.hasNextLine()) {

                // And add the line to the ArrayList
                addName = input.nextLine();
                list.addName(addName, names);
            }
        }
        catch (IOException e) {
            // Otherwise, state that it's an invalid file
            System.out.print("Invalid file.");
        }

        // Return the ArrayList
        return names;
    }

    // Adds the string to the ArrayList
    private void addName(String name, ArrayList<String> names) {
        names.add(name);
    }
}
