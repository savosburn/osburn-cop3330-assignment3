/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    public ArrayList<String> testArray() {
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

    @Test
    void test_alphabetize() {
        CalculationsTest calcTest = new CalculationsTest();
        Calculations calculations = new Calculations();

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Johnson, Jim");
        expected.add("Jones, Aaron");
        expected.add("Jones, Chris");
        expected.add("Ling, Mai");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        expected.add("Zarnecki, Sabrina");

        assertEquals(expected, calculations.alphabetize(calcTest.testArray()));
    }

    @Test
    void test_getSize() {
        CalculationsTest calcTest = new CalculationsTest();
        Calculations calculations = new Calculations();

        assertEquals(7, calculations.getSize(calcTest.testArray()));
    }
}