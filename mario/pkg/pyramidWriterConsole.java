package mario.pkg;

/**
 * Created by brianblosser on 7/13/15.
 */
public class pyramidWriterConsole implements pyramidWriter {


    public pyramidWriterConsole() {
    }

    public void write(int height) {

        System.out.println("\nYou have chosen to print to the console. \n");
        String outputString;
        int numOfLeftSpaces=height-1;
        int numOfHashes= pyramidWriter.INIT_NUM_OF_HASHES;


        for (int i=0; i<height; i++ ) {
            outputString="";
            for (int j=0; j<numOfLeftSpaces; j++) {
                outputString+=" ";
            }
            for (int k=0; k<numOfHashes; k++) {
                outputString+="#";
            }
            System.out.println(outputString);
            numOfLeftSpaces--;
            numOfHashes++;
        }
    }
}
