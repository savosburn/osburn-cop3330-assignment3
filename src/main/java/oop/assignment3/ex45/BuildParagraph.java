/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex45;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class BuildParagraph {

    public ArrayList<String> readFile(String infile) {
        BuildParagraph paragraph = new BuildParagraph();
        ArrayList<String> names = new ArrayList<>();

        String addWord;

        // As long as the infile exists
        try(Scanner input = new Scanner(Paths.get(infile))) {

            // And as long as the next input is a valid string
            while (input.hasNext()) {

                // Add that word to the ArrayList of words
                addWord = input.next();
                paragraph.addWord(addWord, names);
            }
        } catch (IOException e) {
            System.out.print("Invalid input file.");
        }

        // Return the ArrayList of words
        return names;
    }

    public void addWord(String word, ArrayList<String> paragraph) {

        // Add the word to the list of words
        paragraph.add(word);
    }
}
