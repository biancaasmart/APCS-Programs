/**
* Prog 155t Finding Sum and Average
* Bianca Smart
* 10/12/16
* BlueJ
* This program reads an external data file, prints all of the numbers and their sum and average.
* 
* Learned - N/a
* Difficulties - N/a
*
**/

import java.util.*;
import java.io.*;
public class SumandAverage
{
    public static void main(String[] args) throws IOException
    {   
        Scanner inFile = new Scanner (new File("ini.dat")); //Creates new scanner object to read file
        System.out.println("Scores"); 
        int sum = 0; //Declares variables
        int score;
        int n = 0;
        while(inFile.hasNext()) //Prints number while there is next one
        {
            score = inFile.nextInt(); //Prints next number
            System.out.println(score);
            sum+=score; //Adds number to total
            n++; //Incriments number count
        }
        System.out.println("The sum of the number = "+sum); //Prints outputs
        System.out.println("The number of scores = "+n);
        System.out.println("The average of the numbers = "+((double)sum/n));
    }
}
/**
 * Output:
 * Scores
3
8
1
13
18
15
7
17
1
14
0
12
3
2
5
4
The sum of the number = 123
The number of scores = 16
The average of the numbers = 7.6875

 */
