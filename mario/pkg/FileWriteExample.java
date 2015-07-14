package mario.pkg;

import java.io.*;

/**
 * Created by brianblosser on 7/13/15.
 */
public class FileWriteExample {

    public static void main(String[] args) throws IOException  {

        BufferedWriter outputStream=null;

        try {
            try {

                outputStream = new BufferedWriter(new FileWriter("testoutputfile.txt"));
                String testString="Testing file writing";
                outputStream.write(testString);
                outputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {

            if (outputStream!=null) outputStream.close();


        }
    }

}
