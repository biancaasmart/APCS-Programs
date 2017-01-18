/**
* Bianca Smart
* 12/13/16
* BlueJ
* Prog512d UPC
* This program checks the validity of a 12 digit UPS code
*
* Learned -  How to use different methods
* Difficulties - N/a
*
*/
import java.util.*;
import java.io.*;
import java.lang.*;
public class upc
{
   public static void main(String[] args)
   {
       Scanner inFile = null;
       String code = null;
       int evenSum = 0;
       int oddSum = 0;
       char odd;
       char even;
       try //Tries to read an external file
       {
           inFile = new Scanner(new File("prog512.dat"));
        }
       catch (FileNotFoundException e) //Catches excpetion if file is not found
       {
           System.out.println("File not found");
        }
        while(inFile.hasNext()) //Loop for every number
        {
            System.out.println("UPC Code \t Validity"); //Prints header
            code = inFile.next(); //Variable for next code
            System.out.print(code+" \t "); //Prints code
            for(int i = 0; i < 12; i++) //Loops through every number
               {
                  if(i % 2 == 0) //If current number is even
                    {
                        even = code.charAt(i); //Gets character from number
                        evenSum+=Character.getNumericValue(even); //Turns char to int and adds it to even total
                    }
                    else if(i % 2 != 0) //If number is odd
                    {
                        odd = code.charAt(i); //Gets character from number
                        oddSum += Character.getNumericValue(odd); //Turns char into int and adds it to odd total
                    }
                }
            if(((evenSum*3)+oddSum) % 10 == 0) //If total is a multiple of 10
            {
                System.out.print("Valid\n\n"); //Prints validity
            }
            else
            {
                System.out.print("Invalid\n\n"); //Prints that it is invalid
                }
            evenSum = 0; //Resets variables
            oddSum = 0;
            }
            
        }
    }
/**
UPC Code 	 Validity
016499215511 	 Valid

UPC Code 	 Validity
372415613274 	 Invalid

UPC Code 	 Validity
155512994610 	 Valid

UPC Code 	 Validity
011165459192 	 Invalid

UPC Code 	 Validity
838241762110 	 Invalid


 */
