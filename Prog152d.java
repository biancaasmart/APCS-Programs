/**
* Prog 152d Summing some Numbers
* Bianca Smart
* 10/10/16
* BlueJ
* This programtakes input of starting and ending numbers and print, sums, and averages all numbers in between
* 
* Learned - N/a
* Difficulties - N/a
*
**/
import java.util.*;
public class SumNumbers
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in); //Output
        System.out.print("Enter Starting Value:  "); //Takes user input for starting int
        int start = kb.nextInt();
        System.out.print("Enter Ending Value :  "); //Input of ending int
        int end = kb.nextInt();
        int count = start; //New variable to change
        int n = 0; //Number of values
        int sum = 0; //Sums all numbers in between
        do{ //Do while loop
            System.out.print("\n"+count); //Prints number
            sum+=count; //Adds incrementing numbers to total
            count++; //Increases number
            n++; //Increments number of values
        }
        while(count<=end ); //Stops loop once it has reached end
        double average = (double)sum/n; //Finds average
        System.out.println("\nSum of the numbers "+start+".."+end+" is "+sum);
        System.out.println("The average of the numbers "+start+".."+end+" is "+average);
    }
}
/**
 * Output:
Enter Starting Value: 5
Enter Ending Value :  8

5
6
7
8
Sum of the numbers 5..8 is 26
The average of the numbers 5..8 is 6.5

Enter Starting Value:  4
Enter Ending Value :  9

4
5
6
7
8
9
Sum of the numbers 4..9 is 39
The average of the numbers 4..9 is 6.5

Enter Starting Value:  1
Enter Ending Value :  3

1
2
3
Sum of the numbers 1..3 is 6
The average of the numbers 1..3 is 2.0

Enter Starting Value:  3
Enter Ending Value :  5

3
4
5
Sum of the numbers 3..5 is 12
The average of the numbers 3..5 is 4.0

SumNumbers.main({ });
Enter Starting Value:  9
Enter Ending Value :  13

9
10
11
12
13
Sum of the numbers 9..13 is 55
The average of the numbers 9..13 is 11.0

SumNumbers.main({ });
Enter Starting Value:  2
Enter Ending Value :  7

2
3
4
5
6
7
Sum of the numbers 2..7 is 27
The average of the numbers 2..7 is 4.5



 */
