/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex43;

/*
Programming languages can create files and folders too.

Create a program that generates a website skeleton with the following specifications:

Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.

Example Output
Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/

The user should then find these files and directories created in the working directory of your program.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        App myApp = new App();

        String currentDirectory = System.getProperty("user.dir");
        System.out.println("The current working directory is " + currentDirectory);

        String website;
        String author;
        String jsFolder;
        String cssFolder;

        String rootFolder = "website";
        String htmlFolder = "index.html";

        website = myApp.readInput("Site name: ");
        author = myApp.readInput("Author: ");

        jsFolder = myApp.readInput("Do you want a folder for JavaScript? ");
        cssFolder = myApp.readInput("Do you want a folder for CSS? ");

        CreateWebsiteFolder createWebsiteFolder = new CreateWebsiteFolder();
        String output = createWebsiteFolder.folders(rootFolder, website);


        GenerateLink link = new GenerateLink();
        output += link.createHTMLLink(rootFolder, website, author, htmlFolder);

       CreateFile file = new CreateFile();

       output += file.generateFiles(rootFolder, website, jsFolder, cssFolder);



        System.out.print(output);

       //file.generateJsAndCSSFiles(rootFolder,website, "js");
       //file.generateJsAndCSSFiles(rootFolder,website, "css");



        // prompt for website
        // prompt for author
        // ask if you want javascript folder
        // ask if you want a css folder

        // create a directory for the website
            // create an html file in the directory
                // generate html link to put in the directory
            // create a folder called js
            // create a folder called css

        // print to console:
            // each folder was created
    }

    public String readInput(String prompt) {
        System.out.print(prompt);

        return in.nextLine();
    }
}
