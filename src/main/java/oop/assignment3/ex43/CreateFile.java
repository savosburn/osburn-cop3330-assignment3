package oop.assignment3.ex43;

import java.io.File;
import java.nio.file.Files;

public class CreateFile {


    public String generateFiles(String rootFolder, String websiteName, String js, String css) {
        CreateFile file = new CreateFile();

        String output = file.chooseFiles(rootFolder, websiteName, js, css);

        return output;
    }


    public String chooseFiles(String rootFolder, String websiteName, String jsChoice, String cssChoice) {
        CreateFile file = new CreateFile();
        String returnString = null;
        if (jsChoice.toLowerCase().equals("y")) {
            String temp = file.generateJsAndCSSFiles(rootFolder, websiteName, "js");
            returnString = ifNull(returnString, temp);
        }

        if (cssChoice.toLowerCase().equals("y")) {
            String temp = file.generateJsAndCSSFiles(rootFolder, websiteName, "css");
            returnString = ifNull(returnString, temp);
        }

        return returnString;
    }

    private String ifNull(String returnString, String temp) {
        if (returnString == null) {
            returnString = temp;
        }

        else {
            returnString += temp;
        }

        return returnString;
    }

    public String generateJsAndCSSFiles(String rootFolder, String website, String name) {
        String file = String.format("%s/%s/%s", rootFolder, website, name);
        File newFile = new File(file);
        boolean tOrF = newFile.mkdir();

        if (tOrF) {
            return String.format("Created ./%s/%s/%s/\n", rootFolder, website, name);
        }

        // FIX THIS
        return null;
    }

}


