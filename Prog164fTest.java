
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Test
{
    public static void main(String[] args) 
    {
  int[] old = new int[]{1, 2, 3};
  int[] newArray = new int[]{3, 2, 1};
  replaceAll(old, newArray);
  System.out.println(Arrays.toString(old));
}
public static void replaceAll(int[] old, int[] newArray)
{
    for(int x = 0; x<old.length; x++)
        {
              old[x] = newArray[x];
        }
}

    }

