/**
 *
 Bianca Smart
 9/21/16
 Prob 54c
 Circles
 
 Learned-N/A
 Difficulties - N/A
 **/

import java.util.*;
public class Circles
{
    public static void main(String[] args)
    {
        final double pi = 3.14159;
        double radius = 14.87;
        double circ = 2*pi*radius;
        double area = pi*(radius*radius);
        double roundCirc = (int)(circ*1000+.5)/1000.0;
        double roundArea = (int)(area*1000+.5)/1000.0;
        System.out.println("The Radius of the circle =     "+radius);
        System.out.println("The Area of the circle =     "+roundArea);
        System.out.println("The Circumference of the circle =  "+roundCirc);
    }
}
/*
 * Output:
 * The Radius of the circle =     3.712
The Area of the circle =     43.288
The Circumference of the circle =  23.323

The Radius of the circle =     5.0
The Area of the circle =     78.54
The Circumference of the circle =  31.416

The Radius of the circle =     14.87
The Area of the circle =     694.659
The Circumference of the circle =  93.431

 */
