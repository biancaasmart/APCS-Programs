/*
* Prog 54h Donut Island
* Bianca Smart
* 9/29/16
* BlueJ
* This program calculates the amount of square miles available for foraming on a circular island
* 
* Learned - N/a
* Difficulties - N/a
*
**/
public class DonutIsland{
    public static void main(String[] args)
    {
        double diameter = 4.16;
        double lakeRad = .95;
        final double pi = 3.14159265;
        double islandArea = (4.16/2)*2*pi;
        double lakeArea = .95*2*pi;
        double openLand = (int)((islandArea - lakeArea)*100+.5)/100.0;
        System.out.println("Donut island with a diameter of "+diameter+" miles that contains a circular lake of "+lakeRad+" miles has "+openLand+" \nsquare miles of cultivatable land."); 
    }
}
/*
 * Output:
 * Donut island with a diameter of 4.16 miles that contains a circular lake of 0.95 miles has 7.1 
square miles of cultivatable land.

 */
