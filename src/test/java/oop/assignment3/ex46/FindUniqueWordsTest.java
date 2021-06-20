/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex46;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FindUniqueWordsTest {
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

    @ParameterizedTest
    @ValueSource  (strings = {"badger", "cup"})
    void test(String input) {
        FindUniqueWords words = new FindUniqueWords();
        ArrayList<String> uniqueWords = new ArrayList<>();
        uniqueWords.add("badger");
        uniqueWords.add("cup");
        assertFalse(words.isUnique(input, uniqueWords));
    }

    @ParameterizedTest
    @ValueSource  (strings = {"pup", "john"})
    void test_true(String input) {
        FindUniqueWords words = new FindUniqueWords();
        ArrayList<String> uniqueWords = new ArrayList<>();
        uniqueWords.add("badger");
        uniqueWords.add("cup");

        assertTrue(words.isUnique(input, uniqueWords));
    }

    @Test
    void test_uniqueWords() {
        FindUniqueWords words = new FindUniqueWords();
        FindUniqueWordsTest test = new FindUniqueWordsTest();

        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("badger");
        expectedList.add("cup");
        expectedList.add("pup");

        assertEquals(expectedList, words.uniqueWords(test.testLists()));
    }
}