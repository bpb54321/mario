package mario.pkg;

import java.io.*;
/**
 * Created by brianblosser on 7/13/15.
 */
public class filePrinter implements Printer {
    String fileString;

    public String getFileString() {
        return fileString;
    }

    public void setFileString(String fileString) {
        this.fileString = fileString;
    }

    public filePrinter(String fileString) {
        this.fileString=fileString;
    }

    public void write(Pyramid pyramid) {


        try (PrintWriter outputStream = new PrintWriter(new FileWriter(fileString))) {

            outputStream.print(pyramid.toString());

            System.out.println("\nYou have printed to the file '" + fileString + "' \n");

       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
