package oop.assignment3.ex43;

import java.io.*;
import java.nio.file.Files;

public class GenerateLink {

    /*
    public void createHTMLLink(String rootFolder, String website, String author, String htmlFolder) throws IOException {
        String path = String.format("%s/%s/%s", rootFolder, website, htmlFolder);
        File htmlTemplateFile = new File(path);

        FileWriter htmlFile = new FileWriter(htmlTemplateFile);
        System.out.print(createHtmlLink(author, website));
        htmlFile.write(createHtmlLink(author, website));
    }*/

    public String createHTMLLink(String rootFolder, String website, String author, String htmlFolder){
        String path = String.format("%s/%s/%s", rootFolder, website, htmlFolder);
        try{
            File file = new File(path);
            String data = createHtmlLink(author, website);
            String output = String.format("Created ./%s/%s/%s\n", rootFolder, website, htmlFolder);
            PrintWriter writer = new PrintWriter(file);
            writer.write(data);
            writer.close();
            return output;
        } catch(FileNotFoundException e) {
            System.out.print("file not found");
        }

        // FIX THIS
        return null;
    }

    public String createHtmlLink(String author, String website) {
        String link = "<html>\n";

        link += generateHead(author, website);
        link += generateBody();
        link += "</html>";

        return link;
    }

    public String generateHead(String author, String website) {
        return String.format("\t<head>\n\t\t<meta name = \"author\" content = \"%s\">\n\t\t<title>\n\t\t\t%s\n\t\t" +
                "</title>\n\t</head>\n", author, website);
    }

    public String generateBody() {
        return "\t<body>\n\t</body>\n";
    }
}
