import java.util.*;
/**
* Bianca Smart
* 11/29/16
* BlueJ
* Prog500e Dot Leader
* This program prints the appropriate amount of periods for the dot leader so it is exactly 50 characters long
*
* Learned - N/a
* Difficulties - N/a
*
*/
public class DotLeader
{
   public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in); //New Scanner object
       System.out.print("Enter the title: "); 
       String title = kb.nextLine(); //Gets String of the title
       System.out.print("Enter the page number: ");
       String number = kb.next(); //Gets string of the page number
       int nLength = number.length(); //Uses length() method to find length of number
       int titleLength = title.length(); //Uses length() method to find title length
       int dotLength = 50-nLength-titleLength; //Finds how many periods must be printed
       System.out.print(title); //Prints the tite
       for(int i = 0; i < dotLength; i++) //For loop to print appropriate amount of periods
       {
           System.out.print("."); //Prints period
        }
        System.out.print(number); //Prints page number
    }
}
/**
 * Output:
 * Enter the title: An Introduction of Java
Enter the page number: 5
An Introduction of Java..........................5

Enter the title: This Random Title
Enter the page number: 234
This Random Title..............................234
 */
