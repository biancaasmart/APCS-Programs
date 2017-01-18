/**
 Bianca Smart
 9/6/16
 Prog 58b
 Quadratic Formula
 This program inputs three numbers and calculates their roots using the quadratic formula
 
 Learned-N/A
 Difficulties - N/A
 **/
 import java.util.*;
 public class Roots
 {
     public static void main(String[] args)
     {
         Scanner kb = new Scanner(System.in);
         System.out.println("Quadratic Equation Solver");
         System.out.print("Enter A, B, C [all on one line] ");
         int a = kb.nextInt(), b = kb.nextInt(), c = kb.nextInt();
         double discriminant = Math.sqrt(b*b - (4*a*c));
         double baseOne = ((-1*b) - discriminant) / (2.0*a);
         double baseTwo = ((-1*b) + discriminant)/ (2.0*a);
         System.out.println("The roots are: "+baseOne+", "+baseTwo);
        }
    }
    /*
     * Output:
     * Quadratic Equation Solver
       Enter A, B, C [all on one line] 1 5 6
       The roots are: -3.0, -2.0

       Quadratic Equation Solver
       Enter A, B, C [all on one line] 1 1 -2
       The roots are: -2.0, 1.0
       
       Quadratic Equation Solver
       Enter A, B, C [all on one line] 1 1 -6
       The roots are: -3.0, 2.0


     * 
     */
