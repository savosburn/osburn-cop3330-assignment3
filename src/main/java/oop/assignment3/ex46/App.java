/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex46;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        CreateList list = new CreateList();
        FindUniqueWords uniqueWords = new FindUniqueWords();
        FindFrequency freq = new FindFrequency();
        GenerateOutput genOutput =new GenerateOutput();

        // Get the file name
        String fileName = "exercise46_input.txt";

        // Read in all words, and then make a list of each different word
        ArrayList<String> allWords = list.readFile(fileName);
        ArrayList<String> unique = uniqueWords.uniqueWords(allWords);

        // Determine how often each word occurs
        Integer[] frequency = freq.findFrequency(allWords, unique);

        // Print the output
        System.out.print(genOutput.outputString(unique, frequency));
    }
}
