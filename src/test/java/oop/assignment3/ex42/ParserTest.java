/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex42;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    // Can't test splitLine because it's a private method, and it's called inside
    //      tableData method which works
    @Test
    void test_tableData() {
        TestArray testArray = new TestArray();
        Parser parser = new Parser();

        ArrayList<HashMap<String, String>> expected = testArray.inputAsMap();

        assertEquals(expected, parser.tableData(testArray.inputStrings()));
    }

}