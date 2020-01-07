import java.util.Scanner;

public class BMI2
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        Double weight, height, bmi;
        
        System.out.print( "Your height in m? ");
        height = keyboard.nextDouble();

        System.out.print( "Your weight in kg? ");
        weight = keyboard.nextDouble();

        System.out.println( "Your BMI is " + (weight / (height * height))); 

        bmi = (weight / (height * height));

        if ( ( bmi < 18.5 ))
        {
            System.out.print( "BMI Category: under weight");
        }
        if ( ( bmi >= 18.5) && ( bmi <= 24.9))
        {
            System.out.print( "BMI Category: normal weight");
        }
        if ( ( bmi >= 25 ) && ( bmi <= 29.9))
        {
            System.out.print( "BMI Category: overweight");
        }
        if ( ( bmi >= 30.0))
        {
            System.out.print( "BMI Category: normal weight");
        }
    }
}