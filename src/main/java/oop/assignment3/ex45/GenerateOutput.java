package oop.assignment3.ex45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GenerateOutput {
    private static final Scanner in = new Scanner(System.in);
    public String createOutputString(ArrayList<String> paragraph) {
        String output = paragraph.get(0) + " ";

        for (int i = 1; i < paragraph.size(); i++) {
            output += paragraph.get(i) + " ";
        }

        return output;
    }

    public String getOutfile() {
        System.out.print("What is the name of your outfile? ");
        return in.nextLine();
    }

    public void toConsole(String output, String outfile) throws IOException {
        GenerateOutput myOutput = new GenerateOutput();
        FileWriter outFile = new FileWriter(outfile);

        outFile.write(output);

        outFile.close();

    }


}
