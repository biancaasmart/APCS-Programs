/**
* Bianca Smart
* 1/6/17
* BlueJ
* Prog607a Expiration Dates
* This program encodes and decodes expiration date codes
*
* Learned - How to use Ascii and arrays to not have to use if/then looks
* Difficulties - This program was difficult as I tried to find a alternative to
* using a million if/then statements for the letters. It took a while to figure 
* out how to use arrays and how to keep converting from int to char to String 
* and also from Ascii to dates to positions. 
*
*/
import java.util.*;
public class ExpirationDates
{
    public static Scanner kb = new Scanner(System.in); //Class scanner variable
   public static void main(String[] args)
   {
       int option; //Variables for option
       String date, code; //Variables for encoding and decoding
       do{
       System.out.println("-----menu-----"); //Prints menue
       System.out.println("1) Encode Date\n2) Decode Date\n3) Quit");
       System.out.print("Select an option "); //Asks for option
       option = kb.nextInt(); //Saves user's option
       if(option == 1) //If user chooses encode
       {
           System.out.print("enter date (m/d/y) "); //Asks for date to encode
           date = kb.next(); //Saves date
           encode(date); //Calls encode method
        }
        else if(option == 2) //If user chooses to decode
        {
           System.out.print("enter code: "); //Asks for code to decode
           code = kb.next(); //Saves code
           decode( code); //Calls decode method
        }
    }
    while(option != 3); //Loops menue while user doesn't choose 3 to quit
    }
    /**
     * Methods encodes a given date
     * pre - date is in format mm/dd/yy or m/d/yy
     * post - four letter code is printed
     */
    public static void encode(String date)
    {
        int firstSlash = date.indexOf("/"); //Finds location of first slash
        int secondSlash = date.indexOf("/", firstSlash+1); //Finds second slash
        int month = Integer.valueOf(date.substring(0,firstSlash)); //Finds month in date 
        int day = Integer.valueOf(date.substring(firstSlash+1, secondSlash));  //Finds day in string
        int year = Integer.valueOf(date.substring(secondSlash+1)); //Finds year
        System.out.print("The code is: "+convertMonth(month)+convertDay(day)+convertYear(year)+"\n\n"); //Calls methods and prints new code
    }
    /**
     * Method decodes expiration code
     * pre-code is 4 letters 
     * post - decoded date is printed
     */
    public static void decode(String code)
    {
        String month = null, dayOne = null,dayTwo = null, year = null; //Strings for parts of the date
        month = Character.toString(code.charAt(0)); //Sets month variable
        dayOne = Character.toString(code.charAt(1)); //Variable for first digit of day
        dayTwo = Character.toString(code.charAt(2)); //Variable for second digit of day
        year = Character.toString(code.charAt(3)); //Variable for year
        System.out.println("The date is: "); //Prints date
        convertMonth(month); //Calls method to decode month
        System.out.print("/"); //Seperator
        convertDay(dayOne, dayTwo); //Method to decode day
        System.out.print("/");
        convertYear(year); //Method to decode year
        System.out.println("\n");
    }
    /**
     * Method to convert month
     * pre - month is between A and L
     * post - prints number of month represented
     */
    public static void convertMonth(String month)
    {
       int[] months = {1,2,3,4,5,6,7,8,9,10,11,12}; //Array of possible months
       int monthConvert = ((int)month.charAt(0)) - 65; //Converts ascii of month to month number in array
       System.out.print(months[monthConvert]); //Prints out corresponding month number in array
    }
    /**
     * Mothod to convert day
     * pre - day is two letters between Q and Y and O for 0
     * post - prints converted day
     */
    public static void convertDay(String dayOne, String dayTwo)
    {
        int day = 0; //new day
        int[] days = {1,2,3,4,5,6,7,8,9}; //Possible digits in date
        int secondDayConvert = ((int)dayTwo.charAt(0))-81;   //Converts ascii of second day digit to position
        if(!dayOne.equals("O")) //If day is greater than 9
        { 
            int firstDayConvert = ((int)dayOne.charAt(0))-81; //Also converts first digit
            day = ((days[firstDayConvert])*10)+days[secondDayConvert]; //Sets day variable 
            System.out.print(day); //Prints day
        }
        else
        {
            System.out.print(days[secondDayConvert]); //If day is one digit, only prints second digit
        }
    }
    
    /**
     * method to decode year 
     * pre - year is between A-Z and between 1971 and 1996
     * post - prints year represented from 1971-1996
     */
    public static void convertYear(String year)
    { 
        int[] yearN = new int[26]; //new int array for possible numbers
        for(int i = 0; i < 26; i++) //For loop to initialize array
        {
            yearN[i] = 26-i; //Initializes array from 26 to 1
        }
        int yearConvert = ((int)year.charAt(0)) - 65; //Converts year code to ascii and to right position
        int newYear = yearN[yearConvert]+1970; //Calculates the actual year
        System.out.print(newYear); //Prints converted year
    }
    /**
     * method to convert month to code
     * pre - month is between 1 and 12
     * post - prints code corresponding to month
     */
    public static String convertMonth(int month)
    {
        char[] monthLetters = {'A','B','C','D','E','F','G','H','I','J','K','L'}; //Array for possible month letters
        return Character.toString(monthLetters[month-1]); //Converts month number to letter
    }
    /**
     * method to convert day to letters
     * pre - day is less than 31
     * post - prints code for date
     */
    public static String convertDay(int day)
    {
        int firstDigit = 0, secondDigit = 0; //variables for digits in date
        String code = ""; //new code
        if(String.valueOf(day).length() > 1) //if day is more than 10
        {
            secondDigit = day % 10; //assigns second digit
            firstDigit = day/10; //assigns first digit
        }
        else if(String.valueOf(day).length() == 1) //if day is more than 9
        {
            secondDigit = day; //Assigns second digit
        }
        char[] dayLetters = {'Q','R','S','T','U','V','W','X','Y'}; //array for letters for numbers 1-9
        if(firstDigit == 0) //if less than 10
        {
            code+="O"+Character.toString(dayLetters[secondDigit-1]); //adds letters to new code
        }
        else if(firstDigit > 0) //if more than 9
        {
            code+=Character.toString(dayLetters[firstDigit-1]); //adds first and second digit to code
            code+=Character.toString(dayLetters[secondDigit-1]);
        }
        return code; //returns new code
    }
    /**
     * method encodes year to code
     * pre = year < 1995 and year > 1970
     * post = returns encoded year
    */
    public static String convertYear(int year)
    {
        String code = ""; //new code
        int convertYear = (year+1900)-1970; //calculates converted number
        char[] alphabet = new char[26]; //new character array
        int j = 0;
        for(int i = 'A'; i <= 'Z'; i++) //for loop to initialize array
        {
            alphabet[j] = (char)i; //initializes array from A-Z
            j++; //increases j
        }
        code+=Character.toString(alphabet[26-convertYear]); //Adds correct year to code
        return code; //returns new code
    }
    
}
/**
 * -----menu-----
1) Encode Date
2) Decode Date
3) Quit
Select an option 1
enter date (m/d/y) 9/14/83
The code is: IQTN

-----menu-----
1) Encode Date
2) Decode Date
3) Quit
Select an option 1
enter date (m/d/y) 1/14/84
The code is: AQTM

-----menu-----
1) Encode Date
2) Decode Date
3) Quit
Select an option 2
enter code: IQTN
The date is: 
9/14/1983

-----menu-----
1) Encode Date
2) Decode Date
3) Quit
Select an option 1
enter date (m/d/y) 1/1/75
The code is: AOQV

-----menu-----
1) Encode Date
2) Decode Date
3) Quit
Select an option 2
enter code: AQTM
The date is: 
1/14/1984

-----menu-----
1) Encode Date
2) Decode Date
3) Quit
Select an option 2
enter code: AOQV
The date is: 
1/1/1975

-----menu-----
1) Encode Date
2) Decode Date
3) Quit
Select an option 2
enter code: KORH
The date is: 
11/2/1989

-----menu-----
1) Encode Date
2) Decode Date
3) Quit
Select an option 3


 */