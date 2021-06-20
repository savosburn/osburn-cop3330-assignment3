/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JSONParserTest {

    // The other functions in this class are helper functions that cannot
    //      be tested because they are already used in jsonReader and are
    //      private
    @Test
    void test_jsonReader_thing() {
        JSONParser jp = new JSONParser();

        String expected = """
                Name: Thing\s
                Price: 15.00\s
                Quantity: 5
                """;

        assertEquals(expected, jp.jsonReader("thing"));
    }

    @Test
    void test_jsonReader_widget() {
        JSONParser jp = new JSONParser();

        String expected = """
                Name: Widget\s
                Price: 25.00\s
                Quantity: 5
                """;

        assertEquals(expected, jp.jsonReader("widget"));
    }

    @Test
    void test_jsonReader_doodad() {
        JSONParser jp = new JSONParser();

        String expected = """
                Name: Doodad\s
                Price: 5.00\s
                Quantity: 10
                """;

        assertEquals(expected, jp.jsonReader("doodad"));
    }
}