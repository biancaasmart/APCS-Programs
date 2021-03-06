/**
 * Bianca Smart
 * 12/20/2016
 * Prog671a Time Converter
 * Watauga High School
 * 
 * Description: This program makes time conversions and calculates elapsed time within 24 hours
 * What I learned: I learned a lot about nested loops, calculating with time, and using methods
 * 
 * Difficulties: This program was difficult in that it took a very long time and took a lot of
 * thinking and staring at/counting around a clock to figure out how to calculate elapsed time 
 * with just a few equations. It was also difficult to try and write the program from the top 
 * down as I knew I would get confused with all of the nested loops later on when debugging.
 */

import java.util.*;
public class TimeConverter
{
    static Scanner kb = new Scanner(System.in);
   // static DecimalFormat format = new DecimalFormat("##:00");
    public static void main(String[] args)
    {
        System.out.println("Conversion Tasks"); //Prints the header and options from which user can pick
        System.out.println("   1. hours -> minutes");
        System.out.println("   2. days -> hours");
        System.out.println("   3. minutes -> hours");
        System.out.println("   4. hours -> days");
        System.out.println("   5. elapsed time between two times");
        System.out.print("Enter a number: "); //Prompts user to enter a selection of 1-5
        int selection = kb.nextInt(); //New variable for that selection
        System.out.println(); //Starts new line for formatting
        if(selection == 1) //If selection equals number one, runs corresponding method (one()) and etc.
        {
            one(); //Calls method with no parameters
        }
        else if(selection == 2) //^
        {
            two(); 
        }
        else if(selection == 3) //^
        {
            three();
        }
        else if(selection == 4) //^
        {
            four();
        }
        else if(selection == 5) //For 5th option, runs method for calculating elapsed time
        {
            elapsed();
        }
    }
    //*note* documentation is basically the same for methods 1-4
    public static void one() // Method for Hours to minutes
    {
        System.out.println("Hours to Minutes Conversion\n"); //Prints header
        System.out.print("Enter number of hours: "); //Promts user for number of hours
        int hours = kb.nextInt(); //Sets variable equal to number of hours
        int minutes = hours*60; //Makes calculations
        System.out.print(hours+" hours is equal to "+minutes+" minutes"); //Prints the output with new number
    }
    public static void two() //Method for Days to hours 
    {
        System.out.println("Days to Hours Conversion\n");//Prints header
        System.out.print("Enter number of days: ");
        int days = kb.nextInt();
        int hours = days*24; //Calculations
        System.out.print(days+" day(s) is equal to "+hours+" hours"); //Prints output
    }
    public static void three() //Method for Minutes to hours
    {
        System.out.println("Minutes to Hours Conversion\n");//Prints header
        System.out.print("Enter number of minutes: ");
        int min = kb.nextInt();
        double hours = (double)min/60; //Calculations
        double roundHours = (int)(100*hours+.5)/100.0; //Rounds new number calculated
        System.out.print(min+" minutes is equal to "+roundHours+" hours"); //Prints output
    }
    public static void four() //Hours to days
    {
        System.out.println("Hours to Days Conversion\n");//Prints header
        System.out.print("Enter number of hours: ");
        int hours = kb.nextInt();
        double days = (double)hours/24; //Calculations
        double roundDays = (int)(100*days+.5)/100.0; //Rounds
        System.out.print(hours+" hours is equal to "+roundDays+" days"); //Prints output
    }
    public static void elapsed() //Elapsed time
    {
        System.out.println("Elapsed Time Conversion\n");//Prints header
        System.out.print("Enter the beginning hour: "); //Takes in the inputted parts of the time and assigns to new variables
        int beginHr = kb.nextInt(); 
        System.out.print("Enter the beginning minutes: "); //Minutes for beginning time
        int beginMin = kb.nextInt();
        System.out.print("Enter am/pm: "); //AM or PM for beginning time
        String beginM = kb.next();
        System.out.print("Enter the ending hour: "); //Hours for ending time
        int endHr = kb.nextInt();
        System.out.print("Enter the ending minutes: "); //Minutes for ending time
        int endMin = kb.nextInt();
        System.out.print("Enter am/pm: "); //AM or PM for ending time
        String endM = kb.next();
        int eHour = 0; //Variable for elapsed hours
        int eMin = 0; //Variables for elapsed minutes
        if(beginM.equalsIgnoreCase(endM) == false) //AM to PM or PM to AM
        {
            if(endMin >= beginMin) //10:00 AM to 2:30 PM
            {
                eHour = 12-beginHr+endHr; //Calculates elapsed hour
                eMin = endMin - beginMin; //Calculates elapsed minutes
            }
            if(endMin < beginMin) //10:30 AM to 2:00 PM
            {
                eHour =(12-beginHr+endHr)-1; //Calculates elapsed hour with one less for incomplete hour passes
                eMin = beginMin - endMin; //Calculates elapsed minutes
            }
        }
        
        if(beginM.equalsIgnoreCase(endM) == true) //AM to AM or PM to PM
        {
            if(beginHr > endHr) //5 PM to 2 PM 
            {
                eHour = 24-(beginHr-endHr); //Calculates elapsed hours
                if(beginMin <= endMin) //5:00 PM to 4:30 PM
                {
                    eMin = endMin - beginMin; //Calculates elapsed minutes
                }
                if(beginMin > endMin) //5:30 PM to 4:00 PM
                {
                    eHour--; //One less hour for incomplete hour
                    eMin = beginMin - endMin; //Elapsed minutes
                }
            }
            if(endHr >= beginHr) //2 PM to 5 PM
            {
                if(endHr == beginHr) //2 PM to 2 PM
                {
                    eHour = 12; //For AM/PM and same hour, sets equal to 12
                }
                else //2 PM to 5 PM
                {
                    eHour = endHr - beginHr; //Elapsed hour
                }
                if(beginMin <= endMin) //2:00 PM to 5:45 PM
                {
                    eMin = endMin - beginMin; //Elapsed minutes
                }
                if(beginMin > endMin) //2:30 PM to 5:00 PM
                {
                   eMin = beginMin - endMin; //Elapsed minutes
                   eHour--; //One less hour for incomplete hour
                }
              
            }
        }
        
        System.out.print("\nThe elapsed time is: "+eHour+" hrs "+eMin+" min"); //Prints the output with elapsed time
    }
}
/**
 * Output:
 * Conversion Tasks
   1. hours -> minutes
   2. days -> hours
   3. minutes -> hours
   4. hours -> days
   5. elapsed time between two times
Enter a number: 5

Elapsed Time Conversion

Enter the beginning hour: 8
Enter the beginning minutes: 14
Enter am/pm: am
Enter the ending hour: 2
Enter the ending minutes: 47
Enter am/pm: pm

The elapsed time is: 6 hrs 33 min

Conversion Tasks
   1. hours -> minutes
   2. days -> hours
   3. minutes -> hours
   4. hours -> days
   5. elapsed time between two times
Enter a number: 1

Hours to Minutes Conversion

Enter number of hours: 48
48 hours is equal to 2880 minutes

Conversion Tasks
   1. hours -> minutes
   2. days -> hours
   3. minutes -> hours
   4. hours -> days
   5. elapsed time between two times
Enter a number: 2

Days to Hours Conversion

Enter number of days: 3
3 day(s) is equal to 72 hours

Conversion Tasks
   1. hours -> minutes
   2. days -> hours
   3. minutes -> hours
   4. hours -> days
   5. elapsed time between two times
Enter a number: 3

Minutes to Hours Conversion

Enter number of minutes: 64
64 minutes is equal to 1.07 hours

Conversion Tasks
   1. hours -> minutes
   2. days -> hours
   3. minutes -> hours
   4. hours -> days
   5. elapsed time between two times
Enter a number: 4

Hours to Days Conversion

Enter number of hours: 84
84 hours is equal to 3.5 days

Conversion Tasks
   1. hours -> minutes
   2. days -> hours
   3. minutes -> hours
   4. hours -> days
   5. elapsed time between two times
Enter a number: 5

Elapsed Time Conversion

Enter the beginning hour: 11
Enter the beginning minutes: 45
Enter am/pm: am
Enter the ending hour: 12
Enter the ending minutes: 15
Enter am/pm: AM

The elapsed time is: 0 hrs 30 min

Conversion Tasks
   1. hours -> minutes
   2. days -> hours
   3. minutes -> hours
   4. hours -> days
   5. elapsed time between two times
Enter a number: 5

Elapsed Time Conversion

Enter the beginning hour: 6
Enter the beginning minutes: 30
Enter am/pm: pm
Enter the ending hour: 2
Enter the ending minutes: 15
Enter am/pm: pm

The elapsed time is: 19 hrs 15 min

Conversion Tasks
   1. hours -> minutes
   2. days -> hours
   3. minutes -> hours
   4. hours -> days
   5. elapsed time between two times
Enter a number: 5

Elapsed Time Conversion

Enter the beginning hour: 8
Enter the beginning minutes: 45
Enter am/pm: am
Enter the ending hour: 11
Enter the ending minutes: 15
Enter am/pm: am

The elapsed time is: 2 hrs 30 min
 */
