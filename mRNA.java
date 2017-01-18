
/**
* Bianca Smart
* 12/10/16
* BlueJ
* Prog520a mRNA
* This program prints every combination of mRNA
*
* Learned - More about string methods
* Difficulties - It took a while to figure out why the charAt method would return an integer
* and I had to Google the issue many times to figure out that it was char was actually an
* integer value and so by not concatenating the methods, they would add the numbers
*
*/
public class mRNA
{
   public static void main(String[] args)
   {
       String code = "AUCG"; //RNA code parts as a reference
       for(int one = 0; one < 4; one++) //For loop for the first letter
       {
           for(int two = 0; two < 4; two++) //For loop for second letter
           {
               for(int three = 0; three < 4; three++) //For loop for third letter
               {
                   System.out.print(""+code.charAt(one)+code.charAt(two)+code.charAt(three)+"	"); //Prints letter of the code by retrieving charactes from reference string
                   
                }
                System.out.println(); //Starts new line
            }
        }
        
} 
        }
    /**
AAA	AAU	AAC	AAG	
AUA	AUU	AUC	AUG	
ACA	ACU	ACC	ACG	
AGA	AGU	AGC	AGG	
UAA	UAU	UAC	UAG	
UUA	UUU	UUC	UUG	
UCA	UCU	UCC	UCG	
UGA	UGU	UGC	UGG	
CAA	CAU	CAC	CAG	
CUA	CUU	CUC	CUG	
CCA	CCU	CCC	CCG	
CGA	CGU	CGC	CGG	
GAA	GAU	GAC	GAG	
GUA	GUU	GUC	GUG	
GCA	GCU	GCC	GCG	
GGA	GGU	GGC	GGG	

     */

