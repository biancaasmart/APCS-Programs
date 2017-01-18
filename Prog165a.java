/**
* Prog 165a "Wedie" of Stars
* Bianca Smart
* 10/19/16
* BlueJ
* This program outputs a triangle of astericks based on a number imputted of the number of rows & columns
* 
* Learned - N/a
* Difficulties - N/a
*
**/
import java.util.*;
public class Astericks
{
    public static void main(String[] args)
    {
  Scanner kb = new Scanner(System.in); //New scanner object
  System.out.print("Enter the starting size: "); 
  int max = kb.nextInt(); //User input of max number
  int n = max;
  for(int column = max; column>0; column--) //Decrements the number of columns
  {
      for(int row = column; row>0; row--) //Decrements number across
      {
          System.out.print("*"); //Prints asterick
        }
        System.out.print("\n"); //Starts new line when loop ends
    }
}
}
/**
 * Output:
Enter the starting size: 7
 
*******
******
*****
****
***
**
Enter the starting size: 4

****
***
**
*

*
Enter the starting size: 1

*
 
 */
