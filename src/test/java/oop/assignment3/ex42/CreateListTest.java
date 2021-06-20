/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateListTest {

    // No need to test addName; it's a well-tested function and called inside readFile,
    //      so it works;
    @Test
    void test_readFile() {
        TestArray testArray = new TestArray();
        CreateList list = new CreateList();

        // Expected output generated in TestArray
        assertEquals(testArray.inputStrings(), list.readFile("exercise42_input.txt"));
    }
}