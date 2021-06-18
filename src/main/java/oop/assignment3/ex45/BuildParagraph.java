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

        try(Scanner input = new Scanner(Paths.get(infile))) {
            while (input.hasNext()) {

                addWord = input.next();
                paragraph.addWord(addWord, names);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return names;
    }


    public void addWord(String word, ArrayList<String> paragraph) {
        paragraph.add(word);
    }
}
