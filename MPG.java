/**
 * Bianca Smart
 * Watauga High School
 * 9/10/16
 * 
 * This program calculates and prints the gas mileage of 4 different cars
 * Difficulties - N/a
 * What I learned - N/a
 * 
 */
public class MPG
{
    public static void main(String[] args)
    {
        System.out.println("Kansas City Grand Prix");
        System.out.println("Miles/Per Gallon\n");
        double bug = (int)((286.0/9)*10+.5)/10.0;
        double firebird = (int)((412.0/40)*10+.5)/10.0;
        double subaru = (int)((361.0/18)*10+.5)/10.0;
        double cutlass = (int)((161.0/11)*10+.5)/10.0;
        System.out.println("1970 VW Bug averaged     "+bug+" m/g");
        System.out.println("1979 Firebird averaged   "+firebird+" m/g");
        System.out.println("1980 Subaru averaged     "+subaru+" m/g");
        System.out.println("1975 Cutlass averaged    "+cutlass+" m/g");
    }
}
/*
 * Sample Output:
 * Kansas City Grand Prix
Miles/Per Gallon
1970 VW Bug averaged     31.8
1979 Firebird averaged   10.3
1980 Subaru averaged     20.1
1975 Cutlass averaged    14.6

 */