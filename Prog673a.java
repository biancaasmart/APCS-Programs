/**
* Bianca Smart
* 11/19/16
* BlueJ
* Prog673a Asterisk Revisited
* This program has multiple methods to make different kinds of triangls 
* out of *'s
*
* Learned - How to set up and use methods
* Difficulties - I forgot how to make the triangles for a little bit, but 
* I could remind myself by looking back at old programs
*
*/

import java.util.*;
public class AsteriskRevisited
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in); //New Scanner object
        System.out.println("Types of Triangles"); //Header
        System.out.println("   1. Left\n   2. Right\n   3. Center"); //Triangle options
        System.out.print("Enter a number of Triangle Type (1-3): "); //Prompts user for selection
        int type = kb.nextInt(); //Variable for user's choice
        System.out.print("How many rows?: "); //Asks user how many rows
        int rows = kb.nextInt(); //Variable for rows
        if(type == 1) //If user chooses option 1
        {
            leftTriangle(rows); //runs left method with rows as parameter 
        }
        else if(type == 2) //If user chooses option two
        {
            rightTriangle(rows); //Runs method for right triangle
        }
        else if(type == 3) //If user chooses option 3
        {
            centerTriangle(rows); //Runs method for center triangle
        }
    }
    public static void leftTriangle(int rows) //Method for left triangle which returns nothing and has one parameter
    {
        for(int max = 0; max < rows+1; max++) //Loop for number of rows 
        {
            for(int i = 0; i < max; i++) //Prints increasing number of asterisks
            {
                System.out.print("*"); //Prints asterisk
            }
            System.out.print("\n"); //Starts new line
        }
        
    }
    public static void rightTriangle(int rows) //Void method for right triangle with one parameter
    {
       for(int max = 0; max < rows+1; max++) //Number of rows
        {
            for(int j = 0; j < rows-max; j++) //Inner loop that prints correct number of spaces
           {
               System.out.print(" "); //Prints space
            }
            for(int i = 0; i < max; i++) //Loop for asterisks
            {
                System.out.print("*"); //Prints asterisk
            }
            System.out.print("\n"); //Starts new line
        } 
    }
    public static void centerTriangle(int rows) //Void method to print center triangle
    {
        for(int i = 0;i < rows ;i++)  //Outer loop mkes the number of rows 
       {
           for(int j=1;j< rows-i;j++) //Inner loop that prints correct number of spaces
           {
               System.out.print(" "); //Prints space
            }
           for(int k=0;k<= i *2;k++) //Loop for number of stars and increases by 2
            {
                System.out.print("*"); //Prints aterisk
            }
            System.out.println();  //Starts new line
        }
    }
}
/**
 * Output:
 * Types of Triangles
   1. Left
   2. Right
   3. Center
Enter a number of Triangle Type (1-3): 1
How many rows?: 4

*
**
***
****

Types of Triangles
   1. Left
   2. Right
   3. Center
Enter a number of Triangle Type (1-3): 2
How many rows?: 3
   
  *
 **
***

Types of Triangles
   1. Left
   2. Right
   3. Center
Enter a number of Triangle Type (1-3): 3
How many rows?: 5
     *
    ***
   *****
  *******
 *********

 */
