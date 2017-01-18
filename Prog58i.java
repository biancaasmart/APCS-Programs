/**
* Prog 58i Monthly Payment
* Bianca Smart
* 9/29/16
* BlueJ
* This program takes an imput of the loan amount, interest rate, and time to pay it off
* It then calculates and prints the monthly payment amount, interest rate, and total amount.
* 
* Learned - N/a
* Difficulties - It was difficult trying to condense the calculations as much as I could
*
**/
import java.util.*;
public class MonthlyPay
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in); //User imput
        System.out.print("The amount I wish to borrow is? ");
        int amount = kb.nextInt();
        System.out.print("The loan rate I can get is? ");
        double rate = kb.nextDouble();
        System.out.print("The number of years it will take me to pay off the loan is? ");
        int years = kb.nextInt();
        int m = years*12; //Calculates number of months
        double r = rate/1200; 
        double f =Math.pow(1+r, m);
        double step = f / (f-1);
        double monthlyPay = (int)((amount*r*step)*100+.5)/100.0; //Rounds final amount
        System.out.println("\nMy monthly payment will be $ "+monthlyPay);
        double totalInterest = (int)(((monthlyPay*m)-amount)*100+.5)/100.0; //Calculates total interest paid
        System.out.println("Total Interest Paid is $ "+totalInterest);
        double totalAmount = (int)((monthlyPay*m)*100+.5)/100.0;
        System.out.println("Total Amount Paid is $ "+totalAmount); //Calculates total amount paid
        
    }
}
/*
 * Output:
 * #1
 * The amount I wish to borrow is? 7500
The loan rate I can get is? 14.5
The number of years it will take me to pay off the loan is? 3

My monthly payment will be $ 258.16
Total Interest Paid is $ 1793.76
Total Amount Paid is $ 9293.76
#2
The amount I wish to borrow is? 7500
The loan rate I can get is? 14.5
The number of years it will take me to pay off the loan is? 4

My monthly payment will be $ 206.83
Total Interest Paid is $ 2427.84
Total Amount Paid is $ 9927.84
#3
The amount I wish to borrow is? 7500
The loan rate I can get is? 7.5
The number of years it will take me to pay off the loan is? 3

My monthly payment will be $ 233.3
Total Interest Paid is $ 898.8
Total Amount Paid is $ 8398.8
#4
The amount I wish to borrow is? 10000
The loan rate I can get is? 15
The number of years it will take me to pay off the loan is? 2

My monthly payment will be $ 484.87
Total Interest Paid is $ 1636.88
Total Amount Paid is $ 11636.88
#5
The amount I wish to borrow is? 500
The loan rate I can get is? 50
The number of years it will take me to pay off the loan is? 2

My monthly payment will be $ 33.36
Total Interest Paid is $ 300.64
Total Amount Paid is $ 800.64


 */
