import java.util.*;
/**
* Bianca Smart
* 11/18/16
* BlueJ
* Prog213d Weather Forecasting
* This program calculates the temperature and gives the weather condition given the number of cricket chirps
*
* Learned - N/a
* Difficulties - N/a
*
*/
public class WeatherForecasting
{
   public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in); //Scanner object
       System.out.print("Enter Cricket Chirps/Min "); //Gets user imput
       int chirps = kb.nextInt();
       String condition = null; //The string for output
       double f = (chirps+40)/4; //Calculates fahrenheit
       System.out.println("Fahrenheit = "+(int)(f*10+.5)/10.0); //Prints temp
       double c = (f-32)*(5/9.0); //Calculates centigrade
       System.out.println("Centigrade = "+ (int)(c*10+.5)/10.0); //Prints temp
       if(f >= 109) //If statements to determine which condition statement to use
       {
           condition = "Dead Cricket";
        }
        else if(f > 80 && f < 109)
        {
            condition = "Whew";
        }
        else if(f > 64 && f < 81)
        {
            condition = "Ah-hhh";
        }
        else if(f > 44 && f < 65)
        {
            condition = "Take a Jacket";
        }
        else if(f < 45)
        {
            condition = "Bur-rrr";
        }
        System.out.println("Condition = "+condition); //Prints output
    }
}
/**
 * Output:
 * Enter Cricket Chirps/Min 20
Fahrenheit = 15.0
Centigrade = -9.3
Condition = Bur-rrr

Enter Cricket Chirps/Min 180
Fahrenheit = 55.0
Centigrade = 12.8
Condition = Take a Jacket

Enter Cricket Chirps/Min 240
Fahrenheit = 70.0
Centigrade = 21.1
Condition = Ah-hhh

Enter Cricket Chirps/Min 480
Fahrenheit = 130.0
Centigrade = 54.4
Condition = Dead Cricket

 */