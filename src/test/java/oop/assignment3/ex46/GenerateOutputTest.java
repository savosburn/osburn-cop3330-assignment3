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

class GenerateOutputTest {

    @Test
    void testNull_stars_not_null() {
        GenerateOutput genOut = new GenerateOutput();
        String expected = "**";

        assertEquals(expected, genOut.testNull("*"));
    }

    @Test
    void testNull_stars_null() {
        GenerateOutput genOut = new GenerateOutput();
        String expected = "*";

        assertEquals(expected, genOut.testNull(null));
    }

    @ParameterizedTest
    @ValueSource (ints = {0, 1, 2, 3, 4, 5, 6, 7, 10, 1000})
    void test_generateStars(Integer ints) {
        GenerateOutput genOut = new GenerateOutput();

        String expected = null;

        for (int i = 0; i < ints; i++) {
            if (expected == null) {
                expected = "*";
            } else {
                expected += "*";
            }
        }
        assertEquals( expected, genOut.generateStars(ints));
    }

    @ParameterizedTest
    @ValueSource (ints = {-100, -1, Integer.MIN_VALUE})
    void test_generateStars_invalid(Integer ints) {
        GenerateOutput genOut = new GenerateOutput();

        String expected = "Invalid number of stars\n";

        assertEquals( expected, genOut.generateStars(ints));
    }

    @Test
    void test_outputString() {
        GenerateOutput genOut = new GenerateOutput();
        String expected = """
                badger:   *******
                mushroom:  **
                snake:    *
                """;

        ArrayList<String> unique = new ArrayList<>();
        unique.add("badger");
        unique.add("mushroom");
        unique.add("snake");

        Integer[] freqs = {7, 2, 1};

        assertEquals(expected, genOut.outputString(unique, freqs));
    }
}