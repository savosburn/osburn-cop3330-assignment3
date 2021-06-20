/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex42;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws IOException {
        CreateList list = new CreateList();
        Parser parser = new Parser();
        GenerateTable outputTable = new GenerateTable();
        Output output = new Output();

        // Declare variables
        String infile = "exercise42_input.txt";
        String outfile = "exercise42_output.txt";

        ArrayList<String> names;
        ArrayList<HashMap<String, String>> employees;

        // Get employees
        names = list.readFile(infile);

        // Parse employees
        employees = parser.tableData(names);

        // Generate table and output
        String table = outputTable.generateTable(employees);
        output.printTxt(outfile, table);
        System.out.print(table);
    }
}
