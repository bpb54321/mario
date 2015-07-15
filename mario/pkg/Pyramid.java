package mario.pkg;

/**
 * Created by brianblosser on 7/15/15.
 */
public class Pyramid {

    static final int INIT_NUM_OF_HASHES=2;
    int height;

    public Pyramid(int height) {
        this.height = height;
    }

    void setHeight(int height) {
        this.height=height;
    }

    int getHeight() {
        return this.height;
    }

    public String toString() {

        int numOfLeftSpaces=this.height-1;
        int numOfHashes=this.INIT_NUM_OF_HASHES;
        String pyramidString="";
        String lineString;

        for (int i = 0; i < height; i++) {
            lineString = "";
            for (int j = 0; j < numOfLeftSpaces; j++) {
                lineString += " ";
            }
            for (int k = 0; k < numOfHashes; k++) {
                lineString += "#";
            }
            pyramidString=pyramidString + lineString + "\n";
            numOfLeftSpaces--;
            numOfHashes++;
        }

        return pyramidString;
    }
}
