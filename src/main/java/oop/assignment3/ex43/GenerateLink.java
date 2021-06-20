/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex43;

import java.io.*;
import java.nio.file.Files;

public class GenerateLink {

    public String createHTMLLink(String rootFolder, String website, String author, String htmlFolder){
        String path = String.format("%s/%s/%s", rootFolder, website, htmlFolder);

        // Make sure the file exists
        try{
            File file = new File(path);

            // Create the HTML link and signify that it was created
            String data = createHtmlLink(author, website);
            String output = String.format("Created ./%s/%s/%s\n", rootFolder, website, htmlFolder);

            // Write the data to the file
            PrintWriter writer = new PrintWriter(file);
            writer.write(data);
            writer.close();

            // Return the output to the console
            return output;
        } catch(FileNotFoundException e) {
            System.out.print("File not found.\n");
        }

        return null;
    }

    public String createHtmlLink(String author, String website) {
        String link = "<html>\n";

        // Generate the html link
        link += generateHead(author, website);
        link += generateBody();
        link += "</html>";

        return link;
    }

    public String generateHead(String author, String website) {

        // Generate the head of the HTML file
        return String.format("""
                \t<head>
                \t\t<meta name = "author" content = "%s">
                \t\t<title>
                \t\t\t%s
                \t\t</title>
                \t</head>
                """, author, website);
    }

    public String generateBody() {

        // Generate the body of the HTML file
        return "\t<body>\n\t</body>\n";
    }
}
