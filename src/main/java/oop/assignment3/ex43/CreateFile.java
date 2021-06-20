/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex43;

import java.io.File;

public class CreateFile {

    public String generateFiles(String rootFolder, String websiteName, String js, String css) {
        CreateFile file = new CreateFile();

        // Return the output string
        String output = file.chooseFiles(rootFolder, websiteName, js, css);

        return output;
    }


    public String chooseFiles(String rootFolder, String websiteName, String jsChoice, String cssChoice) {
        CreateFile file = new CreateFile();
        String returnString = null;

        // If the user chose to have a JS file
        if (jsChoice.equalsIgnoreCase("y")) {

            // Generate the file
            String temp = file.generateJsAndCSSFiles(rootFolder, websiteName, "js");

            // Add its output to the return string
            returnString = ifNull(null, temp);
        }

        // If the user chose to have a CSS file
        if (cssChoice.equalsIgnoreCase("y")) {

            // Generate the file
            String temp = file.generateJsAndCSSFiles(rootFolder, websiteName, "css");

            // Add its output to the return string
            returnString = ifNull(returnString, temp);
        }

        return returnString;
    }

    private String ifNull(String returnString, String temp) {

        // If the return string is null
        if (returnString == null) {

            // Return the string as the new string
            returnString = temp;
        }

        else {
            // Otherwise, add the new string to the original string
            returnString += temp;
        }

        // Return the string
        return returnString;
    }

    public String generateJsAndCSSFiles(String rootFolder, String website, String name) {
        String file = String.format("%s/%s/%s", rootFolder, website, name);

        // Determine if the file can be created
        boolean tOrF = fileCanBeCreated(file);

        // If the file was successfully created
        if (tOrF) {

            // Let the user know that it was created
            return String.format("Created ./%s/%s/%s/\n", rootFolder, website, name);
        }

        else {
            // Otherwise, signify that it is an invalid new file
            return "File already exists.\n";
        }
    }

    private boolean fileCanBeCreated(String file) {

        // Open the file and make a directory
        File newFile = new File(file);
        return newFile.mkdir();
    }

}


