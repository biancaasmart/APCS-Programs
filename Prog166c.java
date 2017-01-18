
/**
* Prog 166c Pyramid
* Bianca Smart
* 10/20/16
* BlueJ
* This program prints a star made of asterisks using loops
* 
* Learned - N/a
* Difficulties - It was hard to think of the proper way to format the loops to get the desired output
 */
public class Pyramid
{
   public static void main(String[] args)
   {
       for(int i = 0;i < 6;i++)  //Outer loop mkes the number of rows (6)
       {
           for(int j=0;j< 10-i;j++) //Inner loop that prints correct number of spaces
           {
               System.out.print(" "); //Prints space
            }
            for(int k=0;k<= i *2;k++) //Loop for number of stars and increases by 2
            {
                System.out.print("*"); //Prints aterisk
            }
            System.out.println();  //Starts new line
        }
    }
}
/*
 * Output:
 *        *
         ***
        *****
       *******
      *********
     ***********

 */

        
    

