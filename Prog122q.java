import java.util.*;
import java.text.*;
public class CompoundThat
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");
        System.out.print("Enter account balance: $");
        int balance = kb.nextInt();
        int goal = balance*2;
        System.out.print("Enter interest rate(as a decimal) ");
        double interest = kb.nextDouble();
        //double daily = balance * Math.pow((1 + (interest / 365)),365);
        //daily
        boolean end = false;
        System.out.print((int) (76.0252175*100)/100);
        int total;
        while(!end == true)
        {
            for(int years = 1; years<10; years++)
            {
                double daily = balance * Math.pow((1 + (interest / 365)),365);
                total = balance + interest;
                
            }
        }
        
    }
}
