/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex46;

import java.util.ArrayList;

public class FindUniqueWords {

    public ArrayList<String> uniqueWords(ArrayList<String> allWords) {
        ArrayList<String> uniqueWords = new ArrayList<>();

        // For each word
        for (String allWord : allWords) {

            // If the word has not already been included in the list
            if (isUnique(allWord, uniqueWords)) {

                // Add it to the list
                uniqueWords.add(allWord);
            }
        }

        // Return the new ArrayList
        return uniqueWords;
    }

    // Determine if the next word has already been found in the string
    public boolean isUnique(String curWord, ArrayList<String> uniqueWords) {

        //  For every word in the unique words list
        for (String uniqueWord : uniqueWords) {

            // Determine if the current word has already been found in the list
            if (uniqueWord.equals(curWord))
                return false;
        }

        // Word was not in the ArrayList, so it's unique
        return true;
    }
}