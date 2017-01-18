
/**
* Prog 230a Multiples of 3 and 7
* Bianca Smart
* 11/3/16
* BlueJ
* This program prints out in order all integer multiples of 3 and 7 until 100
* 
* Learned - N/a
* Difficulties - N/a
*
**/

public class Multiples37
{
    public static void main(String[] args)
    {
        System.out.println("Integers less than too that are\n evenly divisible by 3 or 7"); //Header
        for(int x = 1; x <= 100; x++) //Count from 1 - 100
        {
            if(x%3 == 0 || x%7 == 0) //Conditional statement if x is a multiple of 3 or 7
            {
                System.out.println(x); //Prints x
            }
        }
    }
}
/**
 * Output:
 * Integers less than too that are
 evenly divisible by 3 or 7
0
3
6
7
9
12
14
15
18
21
24
27
28
30
33
35
36
39
42
45
48
49
51
54
56
57
60
63
66
69
70
72
75
77
78
81
84
87
90
91
93
96
98
99

 */