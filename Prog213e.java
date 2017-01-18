
/**
 * Write a description of class FamilyStats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class FamilyStats
{
    public static void main(String[] args)
    {
        Scanner inFile = null;
        try
        {
            inFile = new Scanner(new File("prog213e.dat"));
        }
        catch (FileNotFoundException e)
        {
            System.out.print("File not found");
        }
        System.out.println("Langner Family");
        System.out.println("Age Group  Distribution   Percentage");
        int under20 = 0, range2039 = 0, range4059 = 0, range6079 = 0, over79 = 0, age, total = 0;
        while(inFile.hasNextInt())
        {
            age = inFile.nextInt();
            total++;
            if(age < 20)
            {
                under20++;
            }
            else if(age > 19 && age < 40)
            {
                range2039++;
            }
            else if(age > 39 && age < 60)
            {
                range4059++;
            }
            else if(age > 59 && age < 80)
            {
                range6079++;
            }
            else if(age > 79)
            {
                over79++;
            }
        }
        System.out.print("   <20\t\t");
        System.out.print(under20+"\t    ");
        System.out.print((double)total/under20+"\n");
        https://www.sciencenews.org/
        System.out.print(" 20-39\t\t");
        System.out.print(range2039+"\t ");
        System.out.print((double)total/range2039+"\n");
    }
}
