package oop.assignment3.ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateOutputTest {

    @Test
    void test_consoleString() {
        ExpectedArrayTest testArray = new ExpectedArrayTest();
        GenerateOutput output = new GenerateOutput();

        String expected = """
                Total of 7 names
                -----------------
                Johnson, Jim
                Jones, Aaron
                Jones, Chris
                Ling, Mai
                Swift, Geoffrey
                Xiong, Fong
                Zarnecki, Sabrina
                """;

        assertEquals(expected, output.consoleString(7, testArray.testArrayAlphabetized()));
    }

    @Test
    void test_numNames() {
        GenerateOutput output = new GenerateOutput();

        String expected = "Total of 7 names\n";

        assertEquals(expected, output.numNames(7));
    }

    @Test
    void test_divider() {
        GenerateOutput output = new GenerateOutput();

        String expected = "-----------------\n";

        assertEquals(expected, output.divider());
    }

    @Test
    void test_list() {
        ExpectedArrayTest testArray = new ExpectedArrayTest();
        GenerateOutput output = new GenerateOutput();

        String expected = """
                Johnson, Jim
                Jones, Aaron
                Jones, Chris
                Ling, Mai
                Swift, Geoffrey
                Xiong, Fong
                Zarnecki, Sabrina
                """;

        assertEquals(expected, output.list(testArray.testArrayAlphabetized()));
    }
}