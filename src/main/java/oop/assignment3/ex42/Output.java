package oop.assignment3.ex42;

import oop.assignment3.ex41.GenerateOutput;

import java.io.FileWriter;
import java.io.IOException;

public class Output {

    public void printTxt(String outFile, String outputData) throws IOException {
        Output output = new Output();
        FileWriter outfile = new FileWriter(outFile);

        outfile.write(outputData);

        outfile.close();
    }
}
