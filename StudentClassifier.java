import java.util.*;
/**
 * Bianca Smart
 * 11/18/16
 * BlueJ
 * Prog 213c If Then Student Classifier
 * This program determines what grade a college student is in given the number of completed units
 * 
 * Difficulties = I forgot to use a switch statement and so had to find a way to work that in
 * Learned = I remembered that .equals() must be used rather than == when comparing data
 */
public class StudentClassifier
{
    public static void main(String[] args)
    {
        int code = 0; //Declares variables
        int number = 0;
        int grade = 0;
        double credits = 0.0;
        boolean go = true; //Variable to keep going is true by default
        Scanner kb = new Scanner(System.in); //New Scanner object
        
        do //Do while loop to see if user wants to continue
        {
        System.out.print("Enter student number ");//Gets user input
        number = kb.nextInt(); 
        System.out.print("Enter credits ");
        credits = kb.nextDouble();
        
        if(credits < 30) //If student is a freshman
        {
            code = 1; //Assigns variable to grade code
        }
        else if(credits >= 30 && credits < 70) //If student if sophomore
        {
            code = 2;
        }
        else if(credits >= 70 && credits < 90) //If student is junior
        {
            code = 3;
        }
        else if(credits > 90) //If student is senior
        {
            code = 4;
        }
        switch(code) //Switch statement for all blocks
        {
            case 1 :
                grade = 1;
                break;
            
            case 2 :
                grade = 2;
                break;
                
            case 3 :
                grade = 3;
                break;
                
            case 4 :
                grade = 4;
                break;
                
            default:
                System.out.println("Error");
            }
        
        /**
        
        **/
        System.out.print("Grade level code = "+grade); //Prints out student grade
        System.out.print("\nDo again(y/n) "); //Prompts user if they want to terminate
        if(kb.next().equals( "y")) //Checks to see if user wants to continue
        {
            System.out.println();
        }
        else //If user wants to quit, makes boolean false
        {
            go = false;
        }
    }
    while(go == true); //Checks boolean value after each iteration
    }
}
/**
 * Output:
 * Enter student number 2352
Enter credits 30.0
Grade level code = 2
Do again(y/n) y

Enter student number 3639
Enter credits 29.9
Grade level code = 1
Do again(y/n) y

Enter student number 4007
Enter credits 70
Grade level code = 3
Do again(y/n) y

Enter student number 4915
Enter credits 103.7
Grade level code = 4
Do again(y/n) n

 */