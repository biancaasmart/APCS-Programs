
/**
* Prog 93a CompSci Power and Light
* Bianca Smart
* 10/2/16
* BlueJ
* This program calculates all of the costs for energy from user imput
* Learned -
* Difficulties - 
*
**/
import java.util.*;
public class PowerandLight
{
   public static void main(String[] args)
   {
       final double kwhCost = .0475;
       final double surcharge = .1;
       final double cityTax = .03;
       Scanner kb = new Scanner(System.in);
       System.out.print("Eter KWH used ");
       int kwhUsed = kb.nextInt();
       double baseCharge = kwhUsed * kwhCost;
       double surchargeCost = surcharge * baseCharge;
       double taxCost = cityTax * baseCharge;
       double totalCost = baseCharge + surchargeCost + taxCost;
       double fixedCost = (int)((totalCost)*100+.5)/100.0;
       double fixedBase = (int)((baseCharge)*100+.5)/100.0;
       double fixedCity = (int)((taxCost)*100+.5)/100.0;
       double fixedSurcharge = (int)((surchargeCost)*100+.5)/100.0;
       double lateCost = (totalCost*.04)+totalCost;
       double fixedLate = (int)((lateCost)*100+.5)/100.0;
       System.out.println("        C O M P S C I  Electric        \n-------------------------------------------");
       System.out.println("Kilowatts Used   "+kwhUsed+" @ $ 0.0475\n-------------------------------------------");
       System.out.println("Base Charge	    $ "+fixedBase+"\nSurcharge	     $ "+fixedSurcharge+"\nCitytax	             $ "+fixedCity);
       System.out.println("                     ______\nPay this amount	    $ "+fixedCost);
       System.out.println("After May 20th Pay  $ "+fixedLate);
       
    }
}
/*
 * Output:
 * Eter KWH used 993
        C O M P S C I  Electric        
-------------------------------------------
Kilowatts Used   993 @ $ 0.0475
-------------------------------------------
Base Charge	    $ 47.17
Surcharge	     $ 4.72
Citytax	             $ 1.42
                     ______
Pay this amount	     $ 53.3
After May 20th Pay  $ 55.43

 */

