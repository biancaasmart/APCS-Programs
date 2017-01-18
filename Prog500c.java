/**
* Bianca Smart
* 11/30/16
* BlueJ 
* Prog500c Foolin' Around With Strings
* This program prints a word for every character in it.
*
* Learned - N/a
* Difficulties - N/a
*
*/
import java.util.*;
public class Strings
{
   public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in); //New Scanner objecy
       System.out.print("Enter your word: "); //Prompts user for input
       String text = kb.next(); //Creates string object for inputted word
       int length = text.length(); //Finds length of word
       System.out.println("The length of your word is "+length+" characters.\n"); //Prints length
       for(int i = 1; i<=length; i++) //Loops number of characters
       {
           System.out.println(text); //Prints word
        }
        System.out.println("\nSo I printed it "+length+" times"); //Prints number of times printed
    }
}
/**
 * Output:
 * Enter your word: Howdy
The length of your word is 5 characters.

Howdy
Howdy
Howdy
Howdy
Howdy

So I printed it 5 times

Enter your word: Java
The length of your word is 4 characters.

Java
Java
Java
Java

So I printed it 4 times

Enter your word: Bianca
The length of your word is 6 characters.

Bianca
Bianca
Bianca
Bianca
Bianca
Bianca

So I printed it 6 times

Enter your word: Strings
The length of your word is 7 characters.

Strings
Strings
Strings
Strings
Strings
Strings
Strings

So I printed it 7 times


 */
