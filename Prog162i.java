/**
* Prog 162i CD's That Don't Play Music
* Bianca Smart
* 10/14/16
* BlueJ
* This program calculates the interest of a CD with a rate that changes annually.
* 
* Learned - N/a
* Difficulties - N/a
*
**/
import java.util.*;
public class CDNoMusic
{
    public static void main(String[] agrs)
    {
        Scanner kb = new Scanner(System.in); //Input
        System.out.print("Enter initial investment ");
        int initial = kb.nextInt();
        double amount = initial; //Declaring variables
        double rate = 0;
        double earned;
        for(int year = 1; year<=5; year++) //Loops 5 times
        {
        System.out.print("Enter Rate for year "+year+" ");
        rate = kb.nextDouble(); //Takes in new annual rate
        earned = (int)(((rate/100.0)*amount)*100+.5)/100.0; //Compounds interest
        amount+=earned; //Adds interest to total
        System.out.println("You earned $"+earned+" interest.\n"); //Output
        //value = initial amount(1+rate/number of times per year)^nt
    }
    System.out.println("Your CD is now worth $"+amount); //Prints the final amount
    } 
    
}
/**
 * Output:
 * Enter initial investment 3000
Enter Rate for year 1 10.0
You earned $300.0 interest.

Enter Rate for year 2 5.0
You earned $165.0 interest.

Enter Rate for year 3 7.0
You earned $242.55 interest.

Enter Rate for year 4 9.0
You earned $333.68 interest.

Enter Rate for year 5 11.0
You earned $444.54 interest.

Your CD is now worth $4485.77

 */
