/**
 *
* Prog 166d Still Below Minimum Wage
* Bianca Smart
* 10/17/16
* BlueJ
* This program outputs the total wages of 3-7 employees for 10-40 hours with a constant wage
* 
* Learned -N/a
* Difficulties - N/a
*
**/

public class MinWage
{
   public static void main(String[] args)
   {
       final int rate = 4; //Sets constant value
       for(int employees = 3; employees < 8; employees++) //Loops number of employees 
       {
           System.out.println("\nWages for "+employees+" employees\n"); //Prints number of employees
           for(int hours = 10; hours<50; hours+=10) //Loops hours worked
           {
               int wages = employees*rate*hours; //Calculates total wages
               System.out.println("For "+hours+" hours worked, the wages are "+wages+" dollars"); //Prints 4 times
               
            }
        }
    }
}
/**
 * MinWage.main({ });

Wages for 3 employees

For 10 hours worked, the wages are 120 dollars
For 20 hours worked, the wages are 240 dollars
For 30 hours worked, the wages are 360 dollars
For 40 hours worked, the wages are 480 dollars

Wages for 4 employees

For 10 hours worked, the wages are 160 dollars
For 20 hours worked, the wages are 320 dollars
For 30 hours worked, the wages are 480 dollars
For 40 hours worked, the wages are 640 dollars

Wages for 5 employees

For 10 hours worked, the wages are 200 dollars
For 20 hours worked, the wages are 400 dollars
For 30 hours worked, the wages are 600 dollars
For 40 hours worked, the wages are 800 dollars

Wages for 6 employees

For 10 hours worked, the wages are 240 dollars
For 20 hours worked, the wages are 480 dollars
For 30 hours worked, the wages are 720 dollars
For 40 hours worked, the wages are 960 dollars

Wages for 7 employees

For 10 hours worked, the wages are 280 dollars
For 20 hours worked, the wages are 560 dollars
For 30 hours worked, the wages are 840 dollars
For 40 hours worked, the wages are 1120 dollars

 */