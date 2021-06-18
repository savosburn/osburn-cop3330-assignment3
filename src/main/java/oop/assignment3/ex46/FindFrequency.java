package oop.assignment3.ex46;


import java.util.ArrayList;

public class FindFrequency {

    public Integer[] findFrequency(ArrayList<String> allWords, ArrayList<String> uniqueWords) {
       FindFrequency freq = new FindFrequency();

        Integer[] freqArray = new Integer[uniqueWords.size()];

        for (int i = 0; i < uniqueWords.size(); i++) {
            freqArray[i] = freq.frequency(allWords, uniqueWords.get(i));
        }

        return freqArray;
    }

    private int frequency(ArrayList<String> allWords, String findFreq) {
        int count = 0;

        for (String allWord : allWords) {
            if (allWord.equals(findFreq)) {
                count++;
            }
        }

        return count;
    }
}
