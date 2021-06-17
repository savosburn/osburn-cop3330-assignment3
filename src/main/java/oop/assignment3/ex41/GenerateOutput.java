package oop.assignment3.ex41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GenerateOutput {

    // Print all to file
    public void toFile(ArrayList<String> nameList, String outFile, int num) throws IOException {
        GenerateOutput output = new GenerateOutput();
        FileWriter outfile = new FileWriter(outFile);

        outfile.write(output.numNames(num));
        outfile.write(output.divider());
        outfile.write(output.list(nameList));

        outfile.close();
    }

    // print all to console
    public String consoleString(int numNames, ArrayList<String> names) {
        GenerateOutput output = new GenerateOutput();

        return output.numNames(numNames) + output.divider() + output.list(names);
    }

    // display header
    public String numNames(int names) {
        return String.format("Total of %d names\n", names);
    }

    // display break
    public String divider() {
        return "-----------------\n";
    }

    // display array list
    public String list(ArrayList<String> names) {
        StringBuilder nameList = new StringBuilder(names.get(0) + "\n");
        for (int i = 1; i < names.size(); i++) {
            nameList.append(names.get(i)).append("\n");
        }

        return nameList.toString();
    }

}
