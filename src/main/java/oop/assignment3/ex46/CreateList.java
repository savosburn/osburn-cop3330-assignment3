/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex46;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateList {
    public ArrayList<String> readFile(String fileName) {
        CreateList list = new CreateList();
        ArrayList <String> words = new ArrayList<>();

        // If the file path is valid
        try(Scanner in = new Scanner(Paths.get(fileName))) {

            // Add words from the file to the list
            words = list.addToList(in, words);

        } catch(IOException e) {

            // Otherwise, tell the user that it was invalid
            System.out.print("Not a valid file.");
        }

        // Return the ArrayList
        return words;
    }

    public ArrayList<String> addToList(Scanner in, ArrayList<String> words) {
        String addWord;

        // While the next input is a valid string
        while (in.hasNext()) {

            // Add it to the ArrayList of string
            addWord = in.next();
            words.add(addWord);
        }

        return words;
    }
}
