package oop.assignment3.ex42;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Parser {

    public ArrayList<HashMap<String, String>> tableData(ArrayList<String> names) {
        Parser parser = new Parser();
//        HashMap<String, String> entries = new HashMap<>();
        ArrayList<HashMap<String, String>> employees = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            HashMap<String, String> entries = new HashMap<>();
            String[] line = splitLine(names, i);


                entries.put("lastNames", line[0]);
                entries.put("firstNames", line[1]);
                entries.put("salaries", line[2]);

                //System.out.print(entries.get("lastNames"));

                employees.add(entries);


            //System.out.print(employees.get(i).get("firstNames"));
           /// System.out.print(employees.get(i).get("lastNames"));
           // System.out.print(employees.get(i).get("salaries"));

        }

        for (int j = 0; j < 7; j++) {
            System.out.print(employees.get(j).get("lastNames"));
        }

        return employees;
    }

    public String[] splitLine(ArrayList<String> names, int i) {
        String line = names.get(i);
        String delims = ",";

        //return line.split(delims);
            return line.split(delims);
    }

    public HashMap<String, String> addData(String line, HashMap<String, String> entries, String key) {
            HashMap<String, String> employee = new HashMap<>();

            employee.put(key, line);

            return employee;
    }

    public void addToList(HashMap<String, String> entries, ArrayList<HashMap<String, String>> list) {
        list.add(entries);
    }
}
