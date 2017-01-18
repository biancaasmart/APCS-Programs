
/**
* Prog 215c Don't Fence Me In
* Bianca Smart
* 10/2/16
* BlueJ
* This program calculates the optimum x value for the width of a fence for the largest possible area
* 
* Learned -N/a
* Difficulties - N/a 
*
**/

public class FenceIn
{
   public static void main(String[] args)
   {
       int area = 0; //Declares all variables 
       int newArea = 0;
       int maxX = 0;
       int maxArea = 0;
       int length = 0;
       for(int x = 1; x < 98; x++) //For loops one to largest possible x value
       {
           newArea = x*(100-2*x); //Calculates new area
           if(newArea > area) //Finds if new area is larger than previous
           {
               maxX = x; //Sets maxX to x where max is reached
               maxArea = maxX*(100-2*maxX); //Finds the area
               length = 100-(2*maxX); //Finds length of other side
            }
           area = x*(100-2*x); //Finds area to compare 
        }
       
       System.out.println("With 100 yards of fencing material: "); //Output
       System.out.println("A rectangle "+maxX+" x "+length+" yards produces the maximum area of "+maxArea+" square yards.");
       
    }
}
/**
 * Output:
 * With 100 yards of fencing material: 
A rectangle 25 x 50 yards produces the maximum area of 1250 square yards.

 */
