package mario.pkg;

import java.util.*;
import java.io.*;

/**
 * A class that runs a script which prints a right-aligned pyramid for Mario to jump over on the terminal or to a file.
 * 
 * @author Brian
 * @version 2.0
 */
public class Mario
{
    public static void main(String[] args) throws IOException
    {
       //Tests
       //testVerifyInput();

        System.out.println("\nWelcome to the Mario Program!  At any time, press 'q' to quit the program.\n");

       // Initialize input streams
       Scanner scanner=new Scanner(System.in);
       String currentInputString;
       
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

                               pyramidWriterConsole pConsole = new pyramidWriterConsole();
                               pConsole.write(height);
                               break printingLoop;

                           case "2":

                               pyramidWriterFile pFile = new pyramidWriterFile();
                               pFile.write(height);
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
    
    static void testVerifyInput() {
        //
        String inputString1="0";
        System.out.println("Test input=" + inputString1);
        System.out.println("Expected output=false");
        System.out.println("Actual output=" + verifyInput(inputString1));
        //
        String inputString2="24";
        System.out.println("Test input=" + inputString2);
        System.out.println("Expected output=false");
        System.out.println("Actual output=" + verifyInput(inputString2));
        //
        String inputString3="8";
        System.out.println("Test input=" + inputString3);
        System.out.println("Expected output=true");
        System.out.println("Actual output=" + verifyInput(inputString3));
        
    }
    
}
