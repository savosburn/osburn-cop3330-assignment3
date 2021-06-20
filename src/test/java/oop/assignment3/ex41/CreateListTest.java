/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateListTest {

    // No need to test addName because it's void, a function that's been tested by Java already, and
    //      is already used in the readLine function
    @Test
    void test_readLine() {
        ExpectedArrayTest testArray = new ExpectedArrayTest();
        CreateList list = new CreateList();

        // Test array created in ExpectedArrayTest.java
        assertEquals(testArray.testArrayNotAlphabetized(), list.readLine("exercise41_input.txt"));
    }
}