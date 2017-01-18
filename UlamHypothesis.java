/**
 * Bianca Smart
 * 11/15/16
 * BlueJ
 * Ulam's Hypothesis
 * This program tests numbers 1-25 with Ulam's Hypothesis
 * 
 * Difficulties - N/a
 * Learned - N/a
 */
public class UlamHypothesis
{
    public static void main(String[] args)
    {
        int x = 0; //Declares x variable
        for(int i = 1; i <= 25; i++) // Loops to test 1-25
        {
            System.out.print(i+": "); //Prints n
            x = i; //Sets x to test number
            do //Do while loop so 1 is processed
            {
                if(x % 2 == 0) //If number of even
                {
                    x = x/2; //Ulam's rule
                    System.out.print(x+" "); //Prints number
                }
                else if(x % 2 == 1 ) //If number is odd
                {
                    x = (x*3)+1; //Ulam's rule
                    System.out.print(x+" "); //Prints number
                }
            }
            while(x != 1); //Loops until x = 1
            System.out.println(); //Starts new line
        }
        //System.out.print(1);
    }
}
/**
 * Output:
 *
1: 4 2 1 
2: 1 
3: 10 5 16 8 4 2 1 
4: 2 1 
5: 16 8 4 2 1 
6: 3 10 5 16 8 4 2 1 
7: 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
8: 4 2 1 
9: 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
10: 5 16 8 4 2 1 
11: 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
12: 6 3 10 5 16 8 4 2 1 
13: 40 20 10 5 16 8 4 2 1 
14: 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
15: 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
16: 8 4 2 1 
17: 52 26 13 40 20 10 5 16 8 4 2 1 
18: 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
19: 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
20: 10 5 16 8 4 2 1 
21: 64 32 16 8 4 2 1 
22: 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
23: 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
24: 12 6 3 10 5 16 8 4 2 1 
25: 76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 

 */