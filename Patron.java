
/**
 * Write a description of class Patron here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Patron
{
    // instance variables 
    private String FName;
    private String LName;
    private String LibNumber;
    private Book patBook;
    
    /**
     * Default Constructor for objects of class Patron
     */
    public Patron()
    {
       FName = null;
       LName = null;
       LibNumber = null;
       patBook = null;
    }
    
     /**
     * Normal Constructor for objects of class Patron
     */
    public Patron(String f, String l, String ln, Book b)
    {
       FName = f;
       LName = l;
       LibNumber = ln;
       patBook = b;
    }
    /********************* Accesors (getters) ***************/
    
    public String getFName()
    {
        return FName;
    }
    public String getLName()
    {
        return LName;
    }
    public String getLibNumber()
    {
        return LibNumber;
    }
    public Book getBook()
    {
        return patBook;
    }
    
    /****************** Mutator (setters) **************/
    
    public void setFName(String f)
    {
        FName = f;
    }
    public void setLName(String l)
    {
        LName = l;
    }
    public void setLibNumber(String ln)
    {
        LibNumber = ln;
    }
    public void setBook(Book b)
    {
        patBook = b;
    }
    
    /**
     * Print the specs of the patron
     */
    public String toString()
    {
        String str = "The specs of this patron are: ";
        str += "\n\t First Name: "+FName;
        str += "\n\t Last Name: " + LName;
        str += "\n\t Library Number: "+LibNumber;
        str += "\n\t " + patBook;
        return str;
    }
}
