/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex46;

import java.util.ArrayList;

public class FindUniqueWords {

    public ArrayList<String> uniqueWords(ArrayList<String> allWords) {
        ArrayList<String> uniqueWords = new ArrayList<>();

        // Loop through the list and isolate one of each word
        for (String allWord : allWords) {

            // Create an ArrayList of each of these words
            if (isUnique(allWord, uniqueWords)) {
                uniqueWords.add(allWord);
            }
        }

        // Return the new ArrayList
        return uniqueWords;
    }

    // Determine if the next word has already been found in the string
    public boolean isUnique(String curWord, ArrayList<String> uniqueWords) {

        //  Word already exists, so it's not unique
        for (String uniqueWord : uniqueWords) {
            if (uniqueWord.equals(curWord))
                return false;
        }

        // Word was not in the ArrayList, so it's unique
        return true;
    }
}