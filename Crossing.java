/**
* Prog 168h Crossing Numbers
* Bianca Smart
* 10/21/16
* BlueJ
* This program uses loops to make an X made out of X's
* 
* Learned - How to manipulate loops better
* Difficulties - It was difficult to find a way to print all of the diagonals on the same line
* with simpl expressions to determine if there was going to be an X. 
*
 */
public class Crossing{
    public static void main(String[] args)
    {
        int length = 21; //Declares dimensions of the X
        int height = 21;
        for (int i = 0; i < length; ++i) { //Outer loop for humber of X across
            for (int x = 0; x < height; x++) { //Inner loop for X 
                if (i == x) //Prints X if at diagonal
                {
                    System.out.print("X"); //Prints X
                }
                else if (i == (height - x- 1)) // Prints X at far diagonal
                {
                    System.out.print("X");
                } else
                {
                    System.out.print(" "); //Prints space
                }

            }
            System.out.println(); //Starts new row
        }
    
}
}
/**
 * Output:
X                   X
 X                 X 
  X               X  
   X             X   
    X           X    
     X         X     
      X       X      
       X     X       
        X   X        
         X X         
          X          
         X X         
        X   X        
       X     X       
      X       X      
     X         X     
    X           X    
   X             X   
  X               X  
 X                 X 
X                   X

 */