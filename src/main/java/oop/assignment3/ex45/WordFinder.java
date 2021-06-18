package oop.assignment3.ex45;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WordFinder {

    public ArrayList<String> modifyList(ArrayList<String> paragraph) {
        WordFinder finder = new WordFinder();

        for (int i = 0; i < paragraph.size(); i++) {
            if (paragraph.get(i).contains("utilize")) {
                finder.utilizeToUse(paragraph, i);
            }
        }

        return paragraph;
    }

    private void utilizeToUse(ArrayList<String> utilize, int i) {
        String master = utilize.get(i);
        String target = "utilize";
        String replacement = "use";

        String processed = master.replace(target, replacement);

        utilize.set(i, processed);
    }
}
