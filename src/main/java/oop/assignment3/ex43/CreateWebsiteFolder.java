package oop.assignment3.ex43;

import java.io.File;

public class CreateWebsiteFolder {


    public String folders(String root, String web) {
        CreateWebsiteFolder folder = new CreateWebsiteFolder();

        folder.createRootFolder(root);
        return folder.createWebsiteFolder(root, web);
    }

    public void createRootFolder(String rootFolder) {
        File newFile = new File(rootFolder);
        boolean tOrF = newFile.mkdirs();

        if (!tOrF) {
            // FIX THIS
            System.out.print("does not exist");
        }
    }

    public String createWebsiteFolder(String rootFolder, String webName) {
        String path = String.format("%s/%s", rootFolder, webName);
        File newFile = new File(path);

        boolean tOrF = newFile.mkdirs();

        if (tOrF) {
            return String.format("Created ./%s/%s\n", rootFolder, webName);
            //System.out.print("it's been created");
        }

        // FIX THIS
        return "cannot create file";


    }

}
