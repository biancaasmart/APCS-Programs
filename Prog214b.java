import java.util.*;
/**
 *Bianca Smart
 *11/15/16
 *Prog214b Quantity Ordering
 *This program calculates the cost depending on the quantity
 *
 *Learned = N/a
 *Difficulties = N/a
 */
public class QuantityOrdering
{
    public static void main(String[] args)
    {
        System.out.print("Enter Quantity ");
        Scanner kb = new Scanner(System.in);
        int quantity = kb.nextInt(); //Quantity input
        double price; //Declares price
        if(quantity > 300) //If statements to assign quantities to proper price
        {
            price = 7.15;
        }
        else if(quantity < 300 && quantity > 199)
        {
            price = 7.4;
        }
        else if( quantity < 200 && quantity > 99)
        {
            price = 7.75;
        }
        else 
        {
            price = 7.95;
        }
        System.out.println("Price = "+price); //Prints price
        double total = (int)((price*quantity)*100.0+.5)/100.0; //calculates total amount
        System.out.println("Amount due = $"+total); //Prints total amount due
    }
}
/**
 * Output:
 * Enter Quantity 50
Price = 7.95
Amount due = $397.5

Enter Quantity 199
Price = 7.75
Amount due = $1542.25

Enter Quantity 200
Price = 7.4
Amount due = $1480.0

Enter Quantity 475
Price = 7.15
Amount due = $3396.25

Enter Quantity 2
Price = 7.95
Amount due = $15.9

Enter Quantity 374
Price = 7.15
Amount due = $2674.1


 */
