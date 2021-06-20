/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateTableTest {

    @Test
    void test_generateTable() {
        TestArray testArray = new TestArray();
        GenerateTable table = new GenerateTable();

        String expected = """
                Last      First     Salary
                --------------------------
                Ling      Mai       55900
                Johnson   Jim       56500
                Jones     Aaron     46000
                Jones     Chris     34500
                Swift     Geoffrey  14200
                Xiong     Fong      65000
                Zarnecki  Sabrina   51500
                """;

        assertEquals(expected, table.generateTable(testArray.inputAsMap()));
    }

    @Test
    void test_generateHeader() {
        GenerateTable table = new GenerateTable();

        String expected = "Last      First     Salary\n";

        assertEquals(expected, table.generateHeader());
    }

    @Test
    void test_generateDivider() {
        GenerateTable table = new GenerateTable();

        String expected = "--------------------------\n";

        assertEquals(expected, table.generateDivider());
    }

    @Test
    void test_generateData() {
        TestArray testArray = new TestArray();
        GenerateTable table = new GenerateTable();

        String expected = """
                Ling      Mai       55900
                Johnson   Jim       56500
                Jones     Aaron     46000
                Jones     Chris     34500
                Swift     Geoffrey  14200
                Xiong     Fong      65000
                Zarnecki  Sabrina   51500
                """;

        assertEquals(expected, table.generateData(testArray.inputAsMap()));
    }
}