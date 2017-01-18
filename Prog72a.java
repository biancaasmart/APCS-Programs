
/**
* Prog 72a Identity Theft
* Bianca Smart
* 9/28/16
* BlueJ
* This program imputs 4-2 digit numbers, sums them up, takes the mod of 26 and then prints the ascii symbol of that value.
* 
* Learned - I was reminded how to convert int values to char to find the ascii valur
* Difficulties - I forgot how to convert int to char
*
**/
import java.util.*;
public class IdentityTheft
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in); //Makes new scanner object
        System.out.print("Enter the credit card number (XX XX XX XX): ");
        int one = kb.nextInt(); //Input of the 8 numbers
        int two = kb.nextInt();
        int three = kb.nextInt();
        int four = kb.nextInt();
        int num = (one+two+three+four)%26+65; //math
        char letter = (char)num; //cast the int as char to find ascii
        System.out.print("The correct number and code is "+one+" "+two+" "+three+" "+four+" "+letter);
    }
}
/*
 * Output:
Enter the credit card number (XX XX XX XX): 16 26 26 26
The correct number and code is 16 26 26 26 Q

Enter the credit card number (XX XX XX XX): 26 54 74 56
The correct number and code is 26 54 74 56 C

Enter the credit card number (XX XX XX XX): 26 26 26 26
The correct number and code is 26 26 26 26 A

Enter the credit card number (XX XX XX XX): 26 54 74 55
The correct number and code is 26 54 74 55 B
 */
