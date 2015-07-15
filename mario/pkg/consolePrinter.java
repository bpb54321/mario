package mario.pkg;

/**
 * Created by brianblosser on 7/13/15.
 */
public class consolePrinter implements Printer {


    public consolePrinter() {
    }

    public void write(Pyramid pyramid) {

        System.out.println("\nYou have chosen to print to the console. \n");

        //Pyramid pyr=new Pyramid(pyramid);
        //String pyramidString=pyramid.toString();
        System.out.println(pyramid.toString());

    }
}
