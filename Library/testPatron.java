
/**
 * Write a description of class testPatron here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class testPatron
{
   public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in);
       Book myBook = new Book("ABC", "Lucy Wells");
       Book myBook2 = new Book("Hiking", "Go Trails");
       Book myBook3 = new Book();
       Patron pat1 = new Patron();
       Patron pat2 = new Patron("Harry","Wells","nash8294",myBook);
       Patron pat3 = new Patron();
       
        System.out.println("" + pat2);
        
        pat1.setFName("Mary");
        pat1.setLName("Suzel");
        pat1.setLibNumber("nash8476");
        pat1.setBook(myBook2);
        System.out.println("\n" + pat1);
        
        System.out.print("Enter Patron's first name: ");
        pat3.setFName(kb.next());
        System.out.print("Enter Patron's last name: ");
        pat3.setLName(kb.next());
        System.out.print("Enter Patron's Library Number: ");
        pat3.setLibNumber(kb.next());
        kb.nextLine();
        System.out.print("Enter the book's title: ");
        myBook3.setTitle(kb.nextLine());
        System.out.print("Enter the book's author: ");
        myBook3.setAuthor(kb.nextLine());
        pat1.setBook(myBook3);
        System.out.println(pat3.getFName() + " " + pat3.getLName() + " has taken out the book, " + myBook3.getTitle() + ", by " + myBook3.getAuthor() + ".");
        
        
    }
}
/**
 * Output:
 * The specs of this patron are: 
	 First Name: Harry
	 Last Name: Wells
	 Library Number: nash8294
	 The specs of this book are: 
	 Title: ABC
	 Author: Lucy Wells

The specs of this patron are: 
	 First Name: Mary
	 Last Name: Suzel
	 Library Number: nash8476
	 The specs of this book are: 
	 Title: Hiking
	 Author: Go Trails
Enter Patron's first name: Lucy
Enter Patron's last name: Smith
Enter Patron's Library Number: nash8274
Enter the book's title: Then and Now
Enter the book's author: Joe Dupont
Lucy Smith has taken out the book, Then and Now,by Joe Dupont.


 */
