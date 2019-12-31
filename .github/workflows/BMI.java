import java.util.Scanner;

public class BMI
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        Double weight, height;
        
        System.out.print( "Your height in m? ");
        height = keyboard.nextDouble();

        System.out.print( "Your weight in kg? ");
        weight = keyboard.nextDouble();

        System.out.println( "Your BMI is " + (weight / (height * height))); 

        
    }
}