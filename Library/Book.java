/**
 * @author Bianca 
 * @version 1
 */
public class Book
{
    // Instance variables
    private String title;
    private String author;
    /**
     * Default Constructor
     */
    public Book()
    {
        title = null;
        author = null;
    }
    
    /**
     * Normal Constructor for the Book object
     */
    public Book(String t, String a)
    {
        //Initialize instance variables
        title = t;
        author = a;
    }
    
    /**
     * Copies the book
     */
    public Book(Book b)
    {
        title = b.title;
        author = b.author;
    }
    
    /**
     * Print the specs of the book object
     */
    public String toString()
    {
        String str = "The specs of this book are: ";
        str += "\n\t Title: "+title;
        str += "\n\t Author: " + author;
        return str;
    }
    
    /************** Accessors (getters) ***************/
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    /****************** Mutator (setters) **************/
    
    public void setTitle(String t)
    {
        title = t;
    }
    public void setAuthor(String a)
    {
        author = a;
    }
    
    
    
    
    
    
}
