
/**
* Bianca Smart
* 11/18/16
* BlueJ
* Prog505c In Between
* This program reads a data file with animal names and prints if the animal is alphabetically
* between Dinosaor and Walrus or not
*
* Learned - How the compareTo method works and what the numbers mean
* Difficulties - It was difficult trying to find the easiest way to format the output
* and so I had to research a lot about java formatting and printf to find a way to do it
*
*/
import java.util.*;
import java.io.*;
public class InBetween
{
   public static void main(String[] args)
   {
       Scanner kb = null; //Declares scanner object
       try //Try catch block to read file
       {
           kb = new Scanner(new File("Prog505c.dat")); //Tries to find external file
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found"); //Prints if file is not found
        }
        String word = null; //Declares the inputted word variable
        String dino = "dinosaur"; //Declares string variable
        String wal = "walrus"; //Declares string
        String between = null; //String variable for output
        while(kb.hasNext()) //While loop for every word
        {
            word = kb.nextLine(); //Assigns variable to every next animal
            int compareDino = word.toLowerCase().compareTo(dino); //Compares lowercase version of word to dinosaor
            int compareWal = word.toLowerCase().compareTo(wal); //Compares lowercase word to walrus
            if(compareDino < 0 || compareWal > 0) //If animal is outside of range
            {
                between = "not between"; //Reassigns string to print "not between"
            }
            else //If animal is inside alphabetical range
            {
                between = "between"; //Assigns string to print between
            }
            System.out.printf("%-13s %s %n",word, between); //Prints formatted output
        }
        }
    }
/**
Vampire       between 
Monkay        between 
Elephant      between 
Ape           not between 
Lion          between 
Hippopotamus  between 
Ant           not between 
Zebra         not between 
Yak           not between 
Antelope      not between 
Dingo         not between 
Whale         not between 
Horse         between 
Cat           not between 
Ostrich       between 
Human         between 
Giraffe       between 

 */
