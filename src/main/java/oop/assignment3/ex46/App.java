/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */


package oop.assignment3.ex46;

/*
Knowing how often a word appears in a sentence or block of text is helpful for
creating word clouds and other types of word analysis. And it’s more useful when running it against lots of text.

Create a program that reads in a file named `exercise46_input.txt` and counts
the frequency of words in the file. Then construct a histogram displaying the words and the frequency,
and display the histogram to the screen.

Example Output
Given the text file `exercise46_input.txt` with this content

badger badger badger
badger mushroom
mushroom snake badger badger
badger

the program would produce the following output:

badger:   *******
mushroom: **
snake:    *
Constraint
Ensure that the most used word is at the top of the report and the least used words are at the bottom.
 */

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        App myApp = new App();
        CreateList list = new CreateList();
        FindUniqueWords uniqueWords = new FindUniqueWords();
        FindFrequency freq = new FindFrequency();
        GenerateOutput genOutput =new GenerateOutput();

        String fileName = "exercise46_input.txt";

        ArrayList<String> allWords = new ArrayList<>();
        ArrayList<String> unique = new ArrayList<>();

        allWords = list.readFile(fileName);

        unique = uniqueWords.uniqueWords(allWords);

        Integer[] frequency = freq.findFrequency(allWords, unique);


        System.out.print(genOutput.outputString(unique, frequency));


        // read file
            // assing to arrayList
        // determine if words are unique and add them to a unique arraylist
        // create a frequency array
        // read the frequency array
        // create output


    }
}
