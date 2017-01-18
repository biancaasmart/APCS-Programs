
/**
* Prog 122c Function Chart
* Bianca Smart
* 10/6/16
* BlueJ
* This program produces a chart that prints specific numbers from 0 to 50 
* 
* Learned - None
* Difficulties - Trying to figure out the pattern in the chart
*
**/

public class FuctionChart
{
   public static void main(String[] agrs)
   {
       for (int x =0; x<=50; x+=2)
       {
           System.out.print(x+"        ");
           if(x<10)
           {
               System.out.print(" ");
            }
           System.out.print(x+1+"        ");
           if(x+1<10){
               System.out.print(" ");
            }
           System.out.print(x*2+"        ");
           if(x*2<10){
               System.out.print("  ");
            }
            else if(x*2<100){
                System.out.print(" ");
            }
           System.out.print(x*x+"\n");
           
        }
    }
}
/**
 *
0         1         0          0
2         3         4          4
4         5         8          16
6         7         12         36
8         9         16         64
10        11        20         100
12        13        24         144
14        15        28         196
16        17        32         256
18        19        36         324
20        21        40         400
22        23        44         484
24        25        48         576
26        27        52         676
28        29        56         784
30        31        60         900
32        33        64         1024
34        35        68         1156
36        37        72         1296
38        39        76         1444
40        41        80         1600
42        43        84         1764
44        45        88         1936
46        47        92         2116
48        49        96         2304
50        51        100        2500

 */
