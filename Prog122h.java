/**
* Prog 122h Function Tables
* Bianca Smart
* 10/5/16
* BlueJ
* This program lists integers 1-20, their squares, square roots, cubes, and fourth roots
* in a five column table.
* 
* Learned - Now to use DecimalFormat 
* Difficulties - Making a way to insert the proper amount of spaces to format the output
*
**/
import java.text.DecimalFormat;
public class FunctionTables
{
   public static void main(String[] args)
   {
       System.out.println("Number    Square   Square Root     Cube     4th Root"); //Prints header
       DecimalFormat df = new DecimalFormat("0.0000"); //New DecimalFormat object
       for(int x = 1; x <= 20 ; x++) //Loops 20 times
       {
           int square = x*x; //Finds square of x
           double sqrt = Math.sqrt(x); //Finds square root of x
           double sqrtRound = (int)(sqrt*10000+.5)/10000.0; //Rounds 4 decimal places
           int cube = x*x*x; //Finds cube
           double fourthRoot = Math.pow(x, 1/4.0); //Finds 4th root
           double four = (int)(fourthRoot*10000+.5)/10000.0; //ROunds
           if(x<10) //Inserts proper amount of spaces to format
           {
               System.out.print(" ");
            }
           System.out.print(x);
           System.out.print("         ");
           if(square<10)  //Inserts proper amount of spaces to format
           {
               System.out.print("  ");
            }
            else if(square<100)
            {
                System.out.print(" ");
            }
            System.out.print(square);
            System.out.print("       "+df.format(sqrtRound)+"        "); //Prints and formats square root
            if(cube<10)  //Inserts proper amount of spaces to format
            {
                System.out.print("   ");
            }
            else if(cube<100)
            {
                System.out.print("  ");
            }
            else if(cube<1000)
            {
                System.out.print(" ");
            }
            System.out.print(cube+"      ");
            System.out.print(df.format(four)); //Prints and formats fourth root
            System.out.print(" \n"); //Starts new line
}
}
}
/**
 * Output:
 * Number    Square   Square Root     Cube     4th Root
     1           1       1.0000           1      1.0000 
     2           4       1.4142           8      1.1892 
     3           9       1.7321          27      1.3161 
     4          16       2.0000          64      1.4142 
     5          25       2.2361         125      1.4953 
     6          36       2.4495         216      1.5651 
     7          49       2.6458         343      1.6266 
     8          64       2.8284         512      1.6818 
     9          81       3.0000         729      1.7321 
    10         100       3.1623        1000      1.7783 
    11         121       3.3166        1331      1.8212 
    12         144       3.4641        1728      1.8612 
    13         169       3.6056        2197      1.8988 
    14         196       3.7417        2744      1.9343 
    15         225       3.8730        3375      1.9680 
    16         256       4.0000        4096      2.0000 
    17         289       4.1231        4913      2.0305 
    18         324       4.2426        5832      2.0598 
    19         361       4.3589        6859      2.0878 
    20         400       4.4721        8000      2.1147 

 */
