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

        // Loop through each index of the array to populate the frequency of the words
        for (int i = 0; i < uniqueWords.size(); i++) {
            freqArray[i] = freq.frequency(allWords, uniqueWords.get(i));
        }

        return freqArray;
    }

    public int frequency(ArrayList<String> allWords, String findFreq) {
        int count = 0;

        // Loop through every word in the file and add to the count if a specific word is found
        for (String allWord : allWords) {
            if (allWord.equals(findFreq)) {
                count++;
            }
        }

        return count;
    }
}
