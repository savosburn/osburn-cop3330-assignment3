/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateLinkTest {

    // The other methods in this function work because they are nested inside of the
    //      createHtmlLink function
    @Test
    void test_createHTMLLink() {
        GenerateLink link = new GenerateLink();

        String expected = """
                <html>
                \t<head>
                \t\t<meta name = "author" content = "Savannah Osburn">
                \t\t<title>
                \t\t\tawesomeco
                \t\t</title>
                \t</head>
                \t<body>
                \t</body>
                </html>""";

        assertEquals(expected, link.createHtmlLink("Savannah Osburn", "awesomeco"));
    }

    @Test
    void test_createHTMLLink_testTwo() {
        GenerateLink link = new GenerateLink();

        String expected = """
                <html>
                \t<head>
                \t\t<meta name = "author" content = "John Smith">
                \t\t<title>
                \t\t\tnewWebsite.com
                \t\t</title>
                \t</head>
                \t<body>
                \t</body>
                </html>""";

        assertEquals(expected, link.createHtmlLink("John Smith", "newWebsite.com"));
    }
}