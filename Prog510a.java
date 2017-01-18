import java.util.*;
/**
* Bianca Smart
* 12/1/16
* BlueJ
* Prog510a Vowel Stars
* This program inputs a name and replaces all vowels with * and inserts an extra space if the number of
* letters is even
*
* Learned - New String methods that can make a program much easier
* Difficulties - I had to go huntiing for a string method that would work for this purpose and I also couldn't
* find a way to print my output centered on the same line so I made it centered on the next line
*
*/
public class VowelStar
{
   public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in); //New Scanner object
       System.out.print("Enter your name: "); //Prompts user for name
       String firstName = kb.next(); //Gets user's first name
       String lastName = kb.next(); //Gets user's last name
       String newFirst = firstName.replaceAll("[aeiouAEIOU]","*"); //Replaces first name's vowels with *
       String newLast = lastName.replaceAll("[aeiouAEIOU]","*"); //Replaces vowels with *
        System.out.print("\t"+newFirst+" "); //Prints centered first name
        if((firstName.length()+lastName.length()) % 2 == 0) //Checks if length of name is evem 
         {  
            System.out.print(" "); //Prints extra space between first and last name
        }
        System.out.print(newLast); //Prints last name
    }
}
/**
 * Output:
 * Enter your name: Molly Fisher
	M*lly F*sh*r
	
	Enter your name: Bianca Smart
	B**nc* Sm*rt
	
	Enter your name: Mickey Mouse
	M*ck*y M**s*
	
	Enter your name: Andrew Jackson
	*ndr*w J*cks*n
 */
