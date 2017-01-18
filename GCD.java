
/**
* Bianca Smart
* 1/18/2017
* BlueJ
* Prog602a Greatest Common Divisor
* This program uses a class to find the grestest common divisor
*
* Learned - I learned more about creating classes
* Difficulties - None
*
*/
import java.io.*;
import java.util.*;
public class GCD
{
    public static void main(String[] args)
    {
        Scanner inFile = null; //Gets data in external file
        try{
            inFile = new Scanner(new File("prog280a.dat")); //Tries file
    }
    catch(FileNotFoundException e)
    {
        System.out.println("File Not Found"); //Catches exception
    }
    while(inFile.hasNext()) //WHile there is a next number
    {
        int a = inFile.nextInt(); //Assigns a
        int b = inFile.nextInt(); //Assigns b
        System.out.println("The GCD of "+a+" and "+b+" is "+calculator.GCD(a, b)); //Calls GCD method from calculator class
    }
    System.out.println(); //New line
    for(int i = 0; i < 5; i++) //Tests the tester method 5 times
        {
            tester(); //Calls tester method
        }
}
  public static void tester() //Tester method
  {
      Random rand = new Random(); //New random object
      int a = rand.nextInt(50); //Makes new random number from 0-50
      int b = rand.nextInt(50); //Makes new random number from 0-50
      System.out.println("The GCD of "+a+" and "+b+" is "+calculator.GCD(a, b)); //Finds GCD of two random numbers
    }
}

/** * Output:
 * The GCD of 25 and 10 is 5
The GCD of 81 and 41 is 1
The GCD of 255 and 138 is 3
The GCD of 847 and 624 is 1
The GCD of 84 and 420 is 84
The GCD of 182 and 637 is 91
The GCD of 620 and 420 is 20
The GCD of 36 and 24 is 12
The GCD of 75 and 125 is 25
The GCD of 1 and 17 is 1

The GCD of 2 and 25 is 1
The GCD of 7 and 26 is 1
The GCD of 33 and 41 is 1
The GCD of 20 and 20 is 20
The GCD of 31 and 5 is 1

 */