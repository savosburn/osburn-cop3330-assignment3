/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex45;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class GenerateOutputTest {

    @Test
    void createOutputString(){

        BuildParagraph paragraphBuilder = new BuildParagraph();
        WordFinder finder = new WordFinder();
        GenerateOutput output = new GenerateOutput();

        String expected = "One should never use the word \"use\" in writing. Use \"use\" instead. For example, \"" +
                "She uses an IDE to write her Java programs\" instead of \"She uses an IDE to write her Java programs\". ";

        ArrayList<String> paragraph = finder.modifyList(paragraphBuilder.readFile("exercise45_input.txt"));

        assertEquals(expected, output.createOutputString(paragraph));
    }
}