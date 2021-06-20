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

        // Check if it's a real file
        try(Scanner in = new Scanner(Paths.get(fileName))) {

            // If the file is valid, add words from the file to the list
            words = list.addToList(in, words);

        } catch(IOException e) {
            System.out.print("Not a valid file.");
        }

        // Return the ArrayList
        return words;
    }

    // Adds all words from the file into the list
    public ArrayList<String> addToList(Scanner in, ArrayList<String> words) {
        String addWord;

        while (in.hasNext()) {
            addWord = in.next();
            words.add(addWord);
        }

        return words;
    }
}
