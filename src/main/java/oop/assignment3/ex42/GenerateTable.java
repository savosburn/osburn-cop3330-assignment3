/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex42;

import java.util.ArrayList;
import java.util.HashMap;

public class GenerateTable {

    // Create table string
    public String generateTable(ArrayList<HashMap<String, String>> employees) {
        GenerateTable table = new GenerateTable();

        return table.generateHeader() + table.generateDivider() + table.generateData(employees);
    }

    // Generate header
    public String generateHeader() {
        return "Last      First     Salary\n";
    }

    // Generate divider
    public String generateDivider() {
        return "--------------------------\n";
    }

    // Generate all data in table style
    public String generateData(ArrayList<HashMap<String, String>> employees) {
        String output = String.format("%-10s%-10s%-10s\n", employees.get(0).get("lastNames"), employees.get(0).get("firstNames"), employees.get(0).get("salaries"));

        // For every employee, add the information to the table
        for (int i = 1;i < employees.size(); i++) {
           output += String.format("%-10s", employees.get(i).get("lastNames"));
           output += String.format("%-10s", employees.get(i).get("firstNames"));
           output += String.format("%-10s\n", employees.get(i).get("salaries"));
        }

        return output;
    }
}
