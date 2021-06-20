/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex42;

import java.util.ArrayList;
import java.util.HashMap;

public class Parser {

    // Parse the strings to create a table
    public ArrayList<HashMap<String, String>> tableData(ArrayList<String> names) {
        ArrayList<HashMap<String, String>> employees = new ArrayList<>();

        // For every employee
        for (int i = 0; i < names.size(); i++) {
            HashMap<String, String> entries = new HashMap<>();

            // Parse their information
            String[] line = splitLine(names, i);

            // Add their information to the HashMap
            entries.put("lastNames", line[0]);
            entries.put("firstNames", line[1]);
            entries.put("salaries", line[2]);

            // Add the employee to the ArrayList
            employees.add(entries);
        }

        // Return the ArrayList of employees
        return employees;
    }

    // Parse the strings at the comma
    private String[] splitLine(ArrayList<String> names, int i) {
        String line = names.get(i);

        // Parse the strings at the comma
        String delims = ",";

        return line.split(delims);
    }
}
