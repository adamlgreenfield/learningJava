import java.util.Scanner;

public class Calculator
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        Double first, second, third;
        
        System.out.print( "What is your first number? ");
        first = keyboard.nextDouble();

        System.out.print( "What is your second number? ");
        second = keyboard.nextDouble();

        System.out.print( "What is your third number? ");
        third = keyboard.nextDouble();

        System.out.println( "( " + first + "  +  " + second + "  +  " + third + " ) / 2 is... " + ((first + second + third) / 2 ));

        
    }
}