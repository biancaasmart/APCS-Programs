import java.util.*;
/**
 * Write a description of class BermudaTriangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BermudaTriangle
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Multiplication Triangle");
        System.out.print("\nNumber of rows for this triangle: 4\n");
        for(int x = 1; x <= 4; x++)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int y = 1; y < 4; y++)
        {
            for(int z = 1; z < y; z++)
            {
                System.out.println(z*y+" ");
            }
            System.out.println();
        }
        /**do{
        System.out.print("\nNumber of rows for this triangle: ");
        int rows = kb.nextInt();
    }
    while(rows != 0);
    **/
    }
}