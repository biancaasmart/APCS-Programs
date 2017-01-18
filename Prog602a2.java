//Class for calculating methods
public class calculator
{
    public static int GCD(int a, int b) //Method to find the GCD
    {
        int GCD = 0; //Variables for GCD
        int temp = 0; //Temporary number used for reassignment
        while(a != 0) //While a is not 0
        {
            if(b > a) //Reassigns numbers so a is the greatest
            {
                temp = a; //Holds a value
                a = b; //Reassigns a to b
                b = temp; //Sets b to a
            }
            a = a-b; //Finds difference
            GCD = b; //Sets GCD equal to b value
        }
        return GCD; //Returns GCD value
    }
}
