
/**
* Prog 162a
* Bianca Smart
* 10/11/16
* BlueJ
* This program takes an inputted number and finds the factorial
* 
* Learned - N/a
* Difficulties - Trying to find the simplest way to toop the entire program
*
**/
import java.util.*;
public class SmallFactorials
{ 
   static Scanner kb = new Scanner(System.in);  
    public static void main(String[] args)
    {
       int n,end,sum = 0; //Declares ints
       boolean check = true; //Declares boolean to see if user wants to continue
       do{ 
           System.out.print("Enter a Number: "); //Runs the factorial calculation
           n = kb.nextInt();
           end = n; //Declaring variables
           sum = 1;
           for(int x = n; x>0; x--)  //Calculates factorial with for loop
            {
                sum*=x;
            }
            System.out.println("The value of "+n+"! is "+sum); //Prints output
            System.out.print("\nWould you like to calculate another number? ");
            String answer = kb.next(); //Gets user's response
            if(answer.equals("Yes")) //Checks if user wants to continue
            {
                System.out.print("\n"); 
                continue;
            }
            else //If they want to terminate the program
            {
                check = false; //Makes boolean false
                System.out.print("\n\"End Factorial Processing\"");
            }
        }
        while(check == true); //Continues if user wants to enter another number
       
    }
}
/**
 * Output:
 * Enter a Number: 6
The value of 6! is 720

Would you like to calculate another number? Yes

Enter a Number: 9
The value of 9! is 362880

Would you like to calculate another number? Yes

Enter a Number: 12
The value of 12! is 479001600

Would you like to calculate another number? No

"End Factorial Processing"

Enter a Number: 1
The value of 1! is 1

Would you like to calculate another number? Yes

Enter a Number: 2
The value of 2! is 2

Would you like to calculate another number? Yes

Enter a Number: 3
The value of 3! is 6

Would you like to calculate another number? Yes

Enter a Number: 4
The value of 4! is 24

Would you like to calculate another number? Yes

Enter a Number: 5
The value of 5! is 120

Would you like to calculate another number? Yes

Enter a Number: 6
The value of 6! is 720

Would you like to calculate another number? Nope

"End Factorial Processing"

 */

