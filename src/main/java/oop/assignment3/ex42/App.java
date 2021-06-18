/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex42;

/*
Sometimes data comes in as a structured format that you have to break down
and turn into records so you can process them. CSV, or comma-separated values,
is a common standard for doing this.

Construct a program that reads in the following data file
(you will need to create this data file yourself; name it `exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500

Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.

Example Output
Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500

Constraints
Write your own code to parse the data. Don't use a CSV parser.
 */

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
