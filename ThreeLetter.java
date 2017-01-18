/**
* Bianca Smart
* 12/15/16
* BlueJ
* Prog512h Three-Letter Word
* This program reads text from a file and determines the percentage of three-letter word
*
* Learned - N/a
* Difficulties - N/a
*
*/

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class ThreeLetter
{
    public static void main(String[] args)
    {
        Scanner newFile = null; //New Scanner object
        String word = null; //Declares string
        int threeCount = 0; //Total of three letter word
        DecimalFormat df = new DecimalFormat("#.##"); //DecimalFormat for output
        int total = 0; //Total word count
        try //Try catch block for reading file
        {
            newFile = new Scanner(new File("prog512h.dat"));
        }
        catch( FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        while(newFile.hasNext()) //Loops while file has next word
        {
            word = newFile.next(); //Reassigns word as next word
           // System.out.print(word+" "); ?
            if(word.length() == 3) //If word has three letters
            {
                threeCount++; //Incriments count of three lettered words
                total++; //Incriments total word count
            }
            else //If word is not three characters long
            {
                total++; //Incriments total
            }
        }
        double percent = threeCount/(double)total*100; //Calculates percentage
        System.out.println("Total Words = "+total); //Prints total count
        System.out.println("Three Letter Words = "+threeCount); //Prints number of three lettered words
        System.out.println("Percentage of Occurance = "+df.format(percent)+"%"); //Prints and formats percentage
    }
}
/**
 * 
Total Words = 93
Three Letter Words = 20
Percentage of Occurance = 21.51%

 */