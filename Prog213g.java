/**
* Prog 213g Solving Linear Equations
* Bianca Smart
* 11/13/16
* BlueJ
* This program solves a linear equation in form Ax + B = 0
* 
* Learned - N/a
* Difficulties - N/a
*
**/

import java.util.*;
public class LinearEquations
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in); //Inputs variables
        System.out.print("Enter A: ");
        double a = kb.nextDouble();
        System.out.print("Enter B: ");
        double b = kb.nextDouble();
        System.out.print(a+"x "); //Prints first part of output
        double x = (0-b)/a; //Solves for x
        if(b > 0) //Prints additio sign if positive B value
        {
            System.out.print("+"+b);
        }
        else if( b < 0) //Prints B value if negative
        {
            System.out.print(b);
        }
        System.out.print(" = 0-->"); //Output 
        if(a == 0 && b == 0) //Catches cases with infinite or no solutions
        {
            System.out.println("There are infinite solutions");
        }
        else if(a == 0 && b != 0)
        {
            System.out.println("There are no solutions");
        }
        else{ 
            System.out.print("x = "+x); //Prints x value if A is non-zero
        }
        
    }
}
/***
 * Output:
 * 
Enter A: 4
Enter B: -5
4.0x -5.0 = 0-->x = 1.25

Enter A: 7
Enter B: 12
7.0x +12.0 = 0-->x = -1.71429

Enter A: 0
Enter B: 0
0.0x  = 0-->There are infinite solutions

Enter A: 0
Enter B: 7
0.0x +7.0 = 0-->There are no solutions

Enter A: 3.5
Enter B: -1.6
3.5x -1.6 = 0-->x = 0.4571428571428572

Enter A: 10
Enter B: 1.5
10.0x +1.5 = 0-->x = -0.15

 */
