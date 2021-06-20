/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex46;

import java.util.ArrayList;

public class FindFrequency {

    public Integer[] findFrequency(ArrayList<String> allWords, ArrayList<String> uniqueWords) {
        FindFrequency freq = new FindFrequency();
        Integer[] freqArray = new Integer[uniqueWords.size()];

        // For each index of the array
        for (int i = 0; i < uniqueWords.size(); i++) {

            // Populate the frequency of the words
            freqArray[i] = freq.frequency(allWords, uniqueWords.get(i));
        }

        return freqArray;
    }

    public int frequency(ArrayList<String> allWords, String findFreq) {
        int count = 0;

        // For every word in the file
        for (String allWord : allWords) {

            // If the word in the ArrayList matches the current word being processed
            if (allWord.equals(findFreq)) {

                // Add it to the frequency count
                count++;
            }
        }

        return count;
    }
}
