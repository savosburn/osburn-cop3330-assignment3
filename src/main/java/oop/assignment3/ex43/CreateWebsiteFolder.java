/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex43;

import java.io.File;

public class CreateWebsiteFolder {

    public String folders(String root, String web) {
        CreateWebsiteFolder folder = new CreateWebsiteFolder();

        // Create the root folder
        folder.createRootFolder(root);

        // Create the website folder
        return folder.createWebsiteFolder(root, web);
    }

    public void createRootFolder(String rootFolder) {
        File newFile = new File(rootFolder);
        boolean tOrF = newFile.mkdirs();

        // Check to see if the folder could be created
        if (!tOrF) {
            System.out.print("Could not be created.\n");
        }
    }

    public String createWebsiteFolder(String rootFolder, String webName) {
        String path = String.format("%s/%s", rootFolder, webName);
        File newFile = new File(path);

        boolean tOrF = newFile.mkdirs();

        // If the website folder could be created
        if (tOrF) {

            // Return a string signifying that the website was created
            return String.format("Created ./%s/%s\n", rootFolder, webName);
        }

        return "File could not be created.\n";
    }

}
