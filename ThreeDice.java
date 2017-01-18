
/**
* Prog 209b Throwing Three Dice
* Bianca Smart
* 11/3/16
* BlueJ
* This program calculates how many different ways three dice can get a sum of 9 and 10 
* 
* Learned - N/a
* Difficulties - N/a
*
**/

public class ThreeDice
{
   public static void main(String[] args)
   {
       int nineWays = 0; //Declaring variables
       int tenWays = 0;
       for(int d1 = 1; d1 <= 6; d1++) //Dice one loops 6 sides
       {
           for(int d2 = 1; d2 <=6 ; d2++) //Dice two loops 6 sides
           {
               for(int d3 = 1; d3<=6; d3++) //Dice three loops 6 sides
               {
                   if(d1 + d2 + d3 == 9) //Finds how many combinations creates a sum of 9
                   {
                       nineWays++; //Increases the variable of combinations
                    }
                    else if(d1+d2+d3 == 10) //FInds how many combinations creates a sum of 10
                    {
                        tenWays++; //Incriments variable 
                    }
                }
            }
        }
        System.out.println("There are "+nineWays+" possible ways to get nine"); //Output
        System.out.println("There are "+tenWays+" possible ways to get ten");
    }
    /**
     * Output:
     * There are 25 possible ways to get nine
There are 27 possible ways to get ten

     */
}
