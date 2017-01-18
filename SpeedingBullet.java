
/**
* Prog215b Faster Than a Speeding Bullet
* Bianca Smart
* 11/2/16
* BlueJ
* This program calculates the maximum height a vertically shot bullet can travel and at what time it reaches
* its maximum.
* 
* Learned - N/a
* Difficulties - N/a
*
**/

public class SpeedingBullet
{
   public static void main(String[] args)
   {
       final int velocity = 960;
       int h = 0; //Declares all initial values  
       int newH = 0;
       int maxH = 0;
       int maxT = 0;
       for(int t = 1; t < 60; t++) //Iterates through 60 seconds 
       {
           newH = 960*t - (16*t*t); //Calculates the new height
           if(newH > h){ //Compares new height of bullet to last height 
               maxH = newH; //Sets maximum to new height if larger than the last
               maxT = t; //Sets time as time when new max is reached
            }
           h = 960*t - (16*t*t); //Calculates height again
        }
        System.out.print("The maximum height reached by the bullet is "+maxH+" feet after "+maxT+" seconds."); //Output
    }
   
    }
/*
 * Output:
 * The maximum height reached by the bullet is 14400 feet after 30 seconds.
 */
