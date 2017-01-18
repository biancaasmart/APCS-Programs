

public class Histogram
{
    public int length; //Class variables length and symbol
    public String symbol;
    public Histogram(int length) //Constructor class for only length
    {
        this.length = length; //Sets length equal to class variable
    }
    public Histogram(int length, String symbol) //Constructor for length and symbol
    {
        this.length = length; //Sets variables equal to class variables
        this.symbol = symbol;
    }
    /**
     * One parameter method to print histogram bar given only length
     * pre = length > 0
     * post = bar of length many asterisks printed with 1000$ = *
     */
    public static String print(int length) //Print method with one parameter
    {
        String bar = ""; //String to add to
        for(int i = 0; i < convert(length); i++) //For loop that calls convert method to find length of bar needed
        {
            bar+="*"; //Adds * to string for each pass
        }
        return bar; //Returns bar 
    }
    /**
     * Method to convert 1000$ to one symbol
     * Pre = length > 1000
     * post = returns number of symbols to use
     */
    public static int convert(int length)
    {
        int newLength =  length/1000; //Divides length by 1000 
        return newLength; //Returns new length that is smaller
    }
    /**
     * Two parameter method to print out histogram bar given length and symbol to use
     */
    public static String print(int length, String symbol) 
    {
        String bar = ""; //String for the bar to be added to
        for(int i = 0; i < convert(length); i++) //For loop that loops number of times as adjusted length
        {
            bar+=symbol; //Adds symbol to bar string
        }
        return bar; //Returns bar
    }
}
