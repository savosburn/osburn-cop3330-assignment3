/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex42;

import java.util.ArrayList;
import java.util.HashMap;

public class TestArray {
    public ArrayList<String> inputStrings() {
        ArrayList<String> expectedArray = new ArrayList<>();

        expectedArray.add("Ling,Mai,55900");
        expectedArray.add("Johnson,Jim,56500");
        expectedArray.add("Jones,Aaron,46000");
        expectedArray.add("Jones,Chris,34500");
        expectedArray.add("Swift,Geoffrey,14200");
        expectedArray.add("Xiong,Fong,65000");
        expectedArray.add("Zarnecki,Sabrina,51500");

        return expectedArray;
    }

    public ArrayList<HashMap<String, String>> inputAsMap() {
        ArrayList<HashMap<String, String>> inputMap = new ArrayList<>();


        HashMap<String, String> data = new HashMap<>();
        data.put("lastNames", "Ling");
        data.put("firstNames", "Mai");
        data.put("salaries", "55900");
        inputMap.add(data);

        HashMap<String, String> dataTwo = new HashMap<>();
        dataTwo.put("lastNames", "Johnson");
        dataTwo.put("firstNames", "Jim");
        dataTwo.put("salaries", "56500");
        inputMap.add(dataTwo);

        HashMap<String, String> dataThree = new HashMap<>();
        dataThree.put("lastNames", "Jones");
        dataThree.put("firstNames", "Aaron");
        dataThree.put("salaries", "46000");
        inputMap.add(dataThree);

        HashMap<String, String> dataFour = new HashMap<>();
        dataFour.put("lastNames", "Jones");
        dataFour.put("firstNames", "Chris");
        dataFour.put("salaries", "34500");
        inputMap.add(dataFour);

        HashMap<String, String> dataFive = new HashMap<>();
        dataFive.put("lastNames", "Swift");
        dataFive.put("firstNames", "Geoffrey");
        dataFive.put("salaries", "14200");
        inputMap.add(dataFive);

        HashMap<String, String> dataSix = new HashMap<>();
        dataSix.put("lastNames", "Xiong");
        dataSix.put("firstNames", "Fong");
        dataSix.put("salaries", "65000");
        inputMap.add(dataSix);

        HashMap<String, String> dataSeven = new HashMap<>();
        dataSeven.put("lastNames", "Zarnecki");
        dataSeven.put("firstNames", "Sabrina");
        dataSeven.put("salaries", "51500");
        inputMap.add(dataSeven);

        return inputMap;
    }
}
