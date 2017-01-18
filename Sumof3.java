
/**
* Prog 152a From 3 to 9669
* Bianca Smart
* 9/28/16
* BlueJ
* This program finds the sum of multiples of 3 from 3 to 9669
* 
* Learned - N/a
* Difficulties - N/a
*
**/
public class Sumof3
{
    public static void main(String[] args)
    {
        int sum = 0;
        for(int x = 3; x <= 9669; x +=3) //For loops by 3
        {
            sum += x; //Adds x to sum
        }
        System.out.print("The sum of the multiples of 3, from 3 to 9669 is "+sum); //Output
    }
}
/*
 * Output:
 * The sum of the multiples of 3, from 3 to 9669 is 15586428
 */