/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FindFrequencyTest {

    public ArrayList<String> testLists () {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add("badger");
        }

        for (int i = 0; i < 4; i++) {
            list.add("cup");
            list.add("pup");
        }

        return list;
    }

    @Test
    void frequency_test_badger() {
        FindFrequency freq = new FindFrequency();
        FindFrequencyTest test = new FindFrequencyTest();
        ArrayList<String> testList = test.testLists();

        assertEquals(5, freq.frequency(testList, "badger"));
    }

    @Test
    void frequency_test_cup() {
        FindFrequency freq = new FindFrequency();
        FindFrequencyTest test = new FindFrequencyTest();
        ArrayList<String> testList = test.testLists();

        assertEquals(4, freq.frequency(testList, "cup"));
    }

    @Test
    void frequency_test_pup() {
        FindFrequency freq = new FindFrequency();
        FindFrequencyTest test = new FindFrequencyTest();
        ArrayList<String> testList = test.testLists();

        assertEquals(4, freq.frequency(testList, "pup"));
    }

    @Test
    void frequency_test_john() {
        FindFrequency freq = new FindFrequency();
        FindFrequencyTest test = new FindFrequencyTest();
        ArrayList<String> testList = test.testLists();

        assertEquals(0, freq.frequency(testList, "john"));
    }

}