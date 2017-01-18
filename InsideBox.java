
/**
* Bianca Smart
* 12/7/16
* BlueJ
* Prog507a Thinking Inside The Box
* This program takes an inputted string and prints it in a box
*
* Learned - N/a
* Difficulties - N/a
*
*/
import java.util.*;
public class InsideBox
{
   public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in); //New Scanner 
       System.out.print("Enter a string: "); //Prompts user for input
       String print = kb.nextLine(); //New string of input
       int length = print.length()+6; //Legth of top line
       for(int i = 0; i < length; i++) //Prints top row of stars
       {
           System.out.print("*"); //Prints star
        }
        
       System.out.print("\n*"); //Stars new line and prints star
       for(int x = 0; x < length-2; x++) //Prints spaces for 2nd row
       {
           System.out.print(" ");
        }
        System.out.print("*\n"); //Prints star and starts new line
        
        System.out.print("*  "+print+"  *"); //Prints middle row with inputted string
       System.out.print("\n*"); //Prints last star and starts new line
       for(int x = 0; x < length-2; x++) //For loop to print 4th row spaces
       {
           System.out.print(" ");
        }
        System.out.print("*\n"); 
        
        for(int i = 0; i < length; i++) //Prints bottom row of stars
       {
           System.out.print("*");
        }
    }
}
/**
 * Enter a string: Thinking
**************
*            *
*  Thinking  *
*            *
**************

Enter a string: Ms. Harris is my cool teacher!
************************************
*                                  *
*  Ms. Harris is my cool teacher!  *
*                                  *
************************************

Enter a string: I
*******
*     *
*  I  *
*     *
*******
     
Enter a string: I love programming!
*************************
*                       *
*  I love programming!  *
*                       *
*************************

Enter a string: Box me up Billy
*********************
*                   *
*  Box me up Billy  *
*                   *
*********************                         
*/