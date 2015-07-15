package mario.pkg;

import java.util.*;
import java.io.*;

/**
 * A class that runs a script which prints a right-aligned pyramid for Mario to jump over on the terminal or to a file.
 * 
 * @author Brian
 * @version 3.0
 */
public class Mario
{
    public static void main(String[] args) throws IOException
    {

        System.out.println("\nWelcome to the Mario Program!  At any time, press 'q' to quit the program.\n");

       // Initialize input streams
       Scanner scanner=new Scanner(System.in);
       String currentInputString;
        String fileString="mario.txt";
       
       programLoop:
           while (true) {
         
               //Input verification
               do {
                   System.out.println("\nWhat size should the pyramid be? Please enter a non-negative integer\n" + 
                        "no greater than 23.\n");
                   currentInputString=scanner.nextLine();
                   
                   if (currentInputString.equals("q")) {
                       break programLoop;//out of whole program
                    }  
                    
               } while (!verifyInput(currentInputString));
               
               System.out.println("\n");
             
               //Since it passed verification, input is the height of the pyramid. 
               int height=Integer.valueOf(currentInputString);
               
               //Ask the user if they want the pyramid printed to the screen or to a file
               printingLoop:
                   while(true) {
                       System.out.println("Enter '1' if you would like the pyramid to print to the screen, " +
                               "'2' if you would like it to print to a file.\n");
                       currentInputString = scanner.nextLine();

                       switch (currentInputString) {
                           case "q":
                               break programLoop;

                           case "1":

                               consolePrinter pConsole = new consolePrinter();
                               pConsole.write(PyramidFactory.buildPyramid(height));
                               break printingLoop;

                           case "2":

                               filePrinter pWriteFile = new filePrinter(fileString);
                               pWriteFile.write(PyramidFactory.buildPyramid(height));
                               break printingLoop;

                           default:

                               System.out.println("\nYou have entered an invalid character. \n");
                               break;
                       }
                   }
        }

        System.out.println("\nYou have quit the program.  Goodbye!\n");

    
    }
    
    static boolean verifyInput(String inputString) {

        int lowerLimit = 1;
        int upperLimit = 23;
        try {

            int inputInt = Integer.valueOf(inputString);
            if (inputInt >= lowerLimit && inputInt <= upperLimit) {
                return true;
            } else {
                System.out.println("\nThat  number is out of range.\n");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("\nInvalid input.\n");
            return false;
        }
    }
    
}
