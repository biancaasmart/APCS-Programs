/**
* Prog 108b Straight Line
* Bianca Smart
* 10/3/16
* BlueJ
* This program imputs 4-2 digit numbers, sums them up, takes the mod of 26 and then prints the ascii symbol of that value.
* 
* Learned - N/a
* Difficulties - N/a
*
**/
import java.util.*;
public class StraightLine
{
   public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in);
       for(int x=1;x<5;x++) //For loop runs 4 times 
       {
           System.out.println("Run #"+x); //Prints number of loop
           System.out.print("Enter Price ");
           double price = kb.nextDouble(); //User imput
           System.out.print("Enter Salvage Value ");
           double salvage = kb.nextDouble();
           System.out.print("Enter Estimated Life in years ");
           int years = kb.nextInt();
           double annualDep =(int)(((price-salvage)/years)*100+.5)/100.0; //Calculates annual depreciation
           System.out.println("Annual Depreciation = "+annualDep+"\n"); //Output
        }
    }
    }
    /*
     * Output:
     * Run #1
Enter Price 250.00
Enter Salvage Value 35.00
Enter Estimated Life in years 8
Annual Depreciation = 26.88

Run #2
Enter Price 2425.00
Enter Salvage Value 470.00
Enter Estimated Life in years 6
Annual Depreciation = 325.83

Run #3
Enter Price 1162.00
Enter Salvage Value 625.00
Enter Estimated Life in years 5
Annual Depreciation = 107.4

Run #4
Enter Price 9654.33
Enter Salvage Value 100.00
Enter Estimated Life in years 12
Annual Depreciation = 796.19


     */

