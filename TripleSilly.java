
/**
* Prog 72a Identity Theft
* Bianca Smart
* 9/28/16
* BlueJ
* This program imputs 4-2 digit numbers, sums them up, takes the mod of 26 and then prints the ascii symbol of that value.
* 
* Learned - I was reminded how to convert int values to char to find the ascii valur
* Difficulties - I forgot how to convert int to char
*
 */
public class TripleSilly
{
   public static void main(String[] args)
   {
       int sum = 0;
       System.out.println("For Loop");
       for(int x = 1; x<=10; x++)
       {
           for(int y = 1 ; y <= x; y++)
           {
               sum+=x;
            }
            System.out.print(sum+" ");
            sum = 0;
        }
        System.out.print("While Loop");
        int n = 10;
        while(n>0)
        {
            
        }
        
    }
}
