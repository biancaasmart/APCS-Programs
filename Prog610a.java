/**
* Bianca Smart
* 1/5/17
* BlueJ
* Prog610a Heron's Formula
* This program reads a file with triangle side lengths and prints its area if it 
* can be a triangle using Heron's formula
*
* Learned - How to use System.out.format() to format the output
* Difficulties - N/a
*
*/
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class HeronsFormula
{
   public static void main(String[] args)
   {
       System.out.println("A    B   C    AREA"); //Prints header
       Scanner fileIn = null; //New scanner object
       try //Try catch block to see if file exists
       {
           fileIn = new Scanner(new File("Prog610a.dat"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found"); //Prints if file is not found
        }
       while(fileIn.hasNextInt()) //While there is a next number in the file
       {
           int a = fileIn.nextInt(); //Creates variables for first three numbers
           int b = fileIn.nextInt();
           int c = fileIn.nextInt();
           System.out.format("%-5d%-4d%-4d",a,b,c); //Formats and prints three numbers
           double s = (a+b+c)/2.0; //calculates s
           if(a + b <= c || //Tests to see if triangle is legal - if two sides is greater than the 3rd
              b + c <= a ||
              a + c <= b)
              {
                  System.out.println(" "+"This is not a triangle"); //Prints not a triangle
                }
                else{ //If it is a triangle
                    System.out.print(" "); //Prints spaces
                    Heron(a,b,c,s); //Calls Heron method to calculate area
                    System.out.println(); //Starts new line
                    
                }
        }
    }
    /**
     * Method to calculate and format the area of a triangle
     * Pre- a,b,c,s > 0
     * Post - Prints formatted area
     */
    public static void Heron(int a, int b, int c, double s) //4 parameter method to calculate area
    {
        DecimalFormat df = new DecimalFormat("####.####"); //Formats number
        double area = Math.sqrt( (s*(s-a)*(s-b)*(s-c) ) ); // Calculates area 
        System.out.print( df.format(area)); //Prints the formatted number
    }
}
/**
A    B   C    AREA
3    4   5    6
3    4   50   This is not a triangle
7    8   9    26.8328
9    9   12   40.2492
6    5   21   This is not a triangle
24   7   25   84
13   12  5    30
50   40  30   600
10   10  10   43.3013
82   34  48   This is not a triangle
4    5   6    9.9216

 */
