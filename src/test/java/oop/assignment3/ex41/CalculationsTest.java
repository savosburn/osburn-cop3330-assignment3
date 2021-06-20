/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    @Test
    void test_alphabetize() {
        Calculations calculations = new Calculations();
        ExpectedArrayTest test = new ExpectedArrayTest();

        // The test array is generated in ExpectedArrayTest.java
        assertEquals(test.testArrayAlphabetized(), calculations.alphabetize(test.testArrayNotAlphabetized()));
    }

    @Test
    void test_getSize() {
        Calculations calculations = new Calculations();
        ExpectedArrayTest test = new ExpectedArrayTest();

        // The test array is generated in ExpectedArrayTest.java
        assertEquals(7, calculations.getSize(test.testArrayAlphabetized()));
    }
}