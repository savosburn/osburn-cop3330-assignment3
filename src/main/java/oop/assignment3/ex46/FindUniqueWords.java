package oop.assignment3.ex46;

import java.util.ArrayList;

public class FindUniqueWords {

    public ArrayList<String> uniqueWords(ArrayList<String> allWords) {
        ArrayList<String> uniqueWords = new ArrayList<>();

        for (String allWord : allWords) {
            if (isUnique(allWord, uniqueWords)) {
                uniqueWords.add(allWord);
            }
        }

        return uniqueWords;
    }

    public boolean isUnique(String curWord, ArrayList<String> uniqueWords) {
        for (String uniqueWord : uniqueWords) {
            if (uniqueWord.equals(curWord))
                return false;
        }

        return true;
    }
}