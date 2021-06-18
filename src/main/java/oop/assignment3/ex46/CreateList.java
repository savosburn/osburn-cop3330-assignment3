package oop.assignment3.ex46;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateList {
    public ArrayList<String> readFile(String fileName) {

        ArrayList <String> words = new ArrayList<>();

        String addWord;

        try(Scanner in = new Scanner(Paths.get(fileName))) {
            while (in.hasNext()) {
                addWord = in.next();
                words.add(addWord);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        return words;
    }


}
