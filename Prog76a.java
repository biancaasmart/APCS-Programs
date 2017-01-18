/**
* Prog 76a Number Manipulation
* Bianca Smart
* 9/28/16
* BlueJ
* This program imputs a number, maniulates it, and prints out the output.
* 
* Learned - 
* Difficulties - I forgot about the size limit and couldn't figure out why using an int produced a wrong number
*
**/
import java.util.*;
public class NumberManip 
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in); //Imput
        System.out.print("Enter a number you dislike ");
        long n = kb.nextInt();
        long multiply = n*9*12345679; //Math
        long finalInt = multiply *1000;
        System.out.println("\n                           "+n+"\n                          X9"+"\n                   _________\n"+"                          "+n*9); //Formats output
        System.out.println("                   x12345679"+"\n                   _________");
        System.out.println("Surprise           "+multiply);
        System.out.println("                       X1000\n                   _________\n\"No Surprise\"?  "+finalInt);
        
    }
}
/*
 * Output:
 * Enter a number you dislike 9

                           9
                          X9
                   _________
                          81
                   x12345679
                   _________
Surprise           999999999
                       X1000
                   _________
"No Surprise"?  999999999000

 */
