package oop.assignment3.ex41;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateList {

    // read input
    public ArrayList<String>  readLine(String fileName) throws IOException {
        CreateList list = new CreateList();
        ArrayList<String> names = new ArrayList<>();
        String addName = " ";
        try(Scanner input = new Scanner(Paths.get(fileName))){
            while(input.hasNextLine()) {
                addName = input.nextLine();
                //System.out.print(addName);
                list.addName(addName, names);
            }
        }
        return names;
    }

    // create arrayList
    private void addName(String name, ArrayList<String> names) {
        // adds names to the list
        names.add(name);
    }
}
