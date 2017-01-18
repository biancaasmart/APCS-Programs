/**
* Bianca Smart
* 1/3/17
* BlueJ
* Prog310a2 Histogram Function
* This program has methods that will round a double to the nearest integer and then print out
* that amounts of a symbol to create a bar of a histogram
*
* Learned - That a number % 0 will produce NaN and that a number under 1 will not work in this program
* Difficulties - N/a
*
*/
import java.util.*;
public class HistogramFunc
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in); //New scanner
        System.out.print("Enter value to chart: "); //Prompts user input
        double n = kb.nextDouble(); //Variable for initial number of symbols
        System.out.print("Do you wish to supply the graphing character (Y/N) "); //Asks user if they want to input symbol
        String graphing = kb.next(); //Takes in response
        if(graphing.equalsIgnoreCase("y")) //If statement for yes response
        {
            System.out.print("Enter the character: "); //Asks user to input character
            String character = kb.next(); //Variable for character
            print(n, character); //Calls method with two parameters
        }
        else if(graphing.equalsIgnoreCase("n")) //If response is no
        {
            print(n); //Calls method with one variable
        }
    }
    /**
     * Rounds a double to the nearest integer
     * pre: n > 1
     * post : returns an integer closest to the initial double
     */
    public static int round(double n) //Method with one parameter and returns int
    {
        double remain = n %(int)n; //Calculates the decimal amount left over
        double newN = n; //New variable to return
        if(remain >= .5) //Calculates if program should round up
        {
            newN+=1-remain; //Adds amount needed to go up to next integer
        }
        else if(remain < .5) //If decimal should be rounded down
        {
           newN-=remain; //Subtracts amount needed to go to next integer down
        }
        return (int)newN; //Returns rounded decimal cast as an integer
    }
    /**
     * Prints out * certain number of times 
     * pre: printN > 1
     * post : prints out as many * as printN rounded to nearest integer
     */
    public static void print(double printN) //Method with one parameter
    {
        double d = printN; //Copies original decimal
        for(int i = 0; i < round(printN); i++) //Loops as many times as rounded decimal
        {
            System.out.print("*"); //Prints default *
        }
        System.out.print(" "+d); //prints original decimal
    }
    /**
     * Prints out specified character certain number of times 
     * pre: printN > 1
     * post : prints out as many specific characters as printN rounded to nearest integer
     */
    public static void print(double printN, String symbol) //Method with two parameters
    {
        double d = printN; //Copies original decimal
        for(int i = 0; i < round(printN); i++) //Loops as many times as rounded decimal
        {
            System.out.print(symbol); //Prints specified symbol
        }
        System.out.print(" "+d); //Prints original decimal
    }
}
/**
 * Output:
Enter value to chart: 13.5 
Do you wish to supply the graphing character (Y/N) N
************** 13.5
 * 
Enter value to chart: 3.2
Do you wish to supply the graphing character (Y/N) y
Enter the character: $
$$$ 3.2

Enter value to chart: 16.1
Do you wish to supply the graphing character (Y/N) y
Enter the character: @
@@@@@@@@@@@@@@@@ 16.1

Enter value to chart: 0.0
Do you wish to supply the graphing character (Y/N) N
 0.0

Enter value to chart: 5.6
Do you wish to supply the graphing character (Y/N) Y
Enter the character: o
oooooo 5.6

Enter value to chart: 9.5
Do you wish to supply the graphing character (Y/N) n
********** 9.5
 */

