package oop.assignment3.ex42;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateList {
    public ArrayList<String> readFile(String infile) throws IOException {
        CreateList list = new CreateList();
        ArrayList<String> names = new ArrayList<>();

        String addName;

        try(Scanner input = new Scanner(Paths.get(infile))){
            while(input.hasNextLine()) {
                addName = input.nextLine();
                list.addName(addName, names);
            }
        }

        return names;
    }

    public void addName(String name, ArrayList<String> names) {
        names.add(name);
    }
}
