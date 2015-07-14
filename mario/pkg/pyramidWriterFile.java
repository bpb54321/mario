package mario.pkg;

import java.io.*;
/**
 * Created by brianblosser on 7/13/15.
 */
public class pyramidWriterFile implements pyramidWriter {


    public pyramidWriterFile() {
    }

    public void write(int height) {


        String outputString;
        int numOfLeftSpaces=height-1;
        int numOfHashes= pyramidWriter.INIT_NUM_OF_HASHES;
        PrintWriter outputStream=null;
        String fileString = "mario.txt";
        try {
           outputStream = new PrintWriter(new FileWriter(fileString));

           for (int i=0; i<height; i++ ) {
                outputString="";
               for (int j=0; j<numOfLeftSpaces; j++) {
                   outputString+=" ";
               }
               for (int k=0; k<numOfHashes; k++) {
                   outputString+="#";
               }
               outputStream.println(outputString);
               numOfLeftSpaces--;
               numOfHashes++;

           }

            System.out.println("\nYou have printed to the file '" + fileString + "' \n");
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           if (outputStream != null) outputStream.close();
       }
    }
}
