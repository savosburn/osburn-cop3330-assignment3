/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex41;

import java.util.ArrayList;

public class ExpectedArrayTest {

    public ArrayList<String> testArrayNotAlphabetized() {
        ArrayList<String> test = new ArrayList<>();
        test.add("Ling, Mai");
        test.add("Johnson, Jim");
        test.add("Zarnecki, Sabrina");
        test.add("Jones, Chris");
        test.add("Jones, Aaron");
        test.add("Swift, Geoffrey");
        test.add("Xiong, Fong");

        return test;
    }

    public ArrayList<String> testArrayAlphabetized() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Johnson, Jim");
        expected.add("Jones, Aaron");
        expected.add("Jones, Chris");
        expected.add("Ling, Mai");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        expected.add("Zarnecki, Sabrina");

        return expected;
    }
}
