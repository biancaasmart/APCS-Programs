
/**
* Prog 230h Egg Mystery
* Bianca Smart
* 11/3/16
* BlueJ
* This program finds the minimum number of eggs in the basket
* 
* Learned - N/a
* Difficulties - N/a
*
**/

public class EggMystery
{
   public static void main(String[] args)
   {
       int n = 0;
       for(int x = 0; x < 500; x++)
       {
           if(x% 2 == 1)
           {
               if(x % 3 == 2)
               {
                   if( x % 4 == 3)
                   {
                       if(x % 5 == 4)
                       {
                           if(x%6 == 5)
                           {
                               if(x % 7 == 0)
                               {
                                   n = x;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("The basket contains "+n+" eggs.");
    }
}
/**
 * The basket contains 119 eggs.

 */
