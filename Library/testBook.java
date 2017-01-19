
/**
 * Write a description of class testBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testBook
{
    public static void main(String[] args)
    {
        Book myBook1 = new Book("Alice in Wonderland", "Lewis Carroll");
        Book myBook2 = new Book();
        Book myBook3 = new Book("On the highway", "Jen Jones");
        Book myBook4 = new Book(myBook3);
        
        System.out.println("" + myBook1);
        System.out.println("" + myBook3);
        
        myBook2.setTitle("Alphabet 123");
        myBook2.setAuthor("Sam Smith");
        System.out.println("" + myBook2);
        myBook3.setAuthor("Jennifer Jones");
        System.out.println("\n" + myBook3);
        
        System.out.print(myBook1.getAuthor()+" ");
        System.out.println(myBook1.getTitle());
        
        System.out.println(myBook4);
        
    }
}
