/**
* Prog 122b Hourly Pay
* Bianca Smart
* 10/4/16
* BlueJ
* This program creates a chart showing the amount earned at $4.00 per
* hour for all possible hours up to 40 hours.
* 
* Learned - N/a
* Difficulties - I had to come up with a way to format the output correctly
*
**/
public class HourlyPay
{
   public static void main(String[] args)
   {
       System.out.println("Hours   Pay");
       int earned = 0;
       for(int x = 1; x<=40; x++) //For loop runs 40 times
       {
           earned = x*4; //Amount earned
           System.out.print(" "+x+"     ");
           if(x<10) //Loop to add a space and format output
           {
               System.out.print(" "); 
            }
           System.out.print(earned+"\n"); //Print amout earned and starts new line
        }
    }
}
/**
 * Output:
 * Hours   Pay
 1      4
 2      8
 3      12
 4      16
 5      20
 6      24
 7      28
 8      32
 9      36
 10     40
 11     44
 12     48
 13     52
 14     56
 15     60
 16     64
 17     68
 18     72
 19     76
 20     80
 21     84
 22     88
 23     92
 24     96
 25     100
 26     104
 27     108
 28     112
 29     116
 30     120
 31     124
 32     128
 33     132
 34     136
 35     140
 36     144
 37     148
 38     152
 39     156
 40     160

 */
