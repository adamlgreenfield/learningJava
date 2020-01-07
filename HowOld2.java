import java.util.Scanner;

public class HowOld2
{
    public static void main( final String[] args)
    {
        final Scanner keyboard = new Scanner (System.in);

        int age;
        String name;

        System.out.print( "Hello, what is your name?");
        name = keyboard.next();

        System.out.print( "Okay " + name + " how old are you?");
        age = keyboard.nextInt();

        if ( age < 16 ) // asks if the age is greater than 16
        {
            System.out.println( "You can't drive " + name + ".");
        }
        if ( age >= 16 && age <= 17 ) // asks if the age is greater than or equal to 16 AND less than or equal to 17
        {
            System.out.println( "You can drive but can't vote "  + name + ".");
        }
        if ( age > 17 && age < 24 ) // asks if age is greater than or less than 24
        {
            System.out.println( "You can vote but not rent a car " + name + ".");
        }
        if ( age >= 24 ) // asks if the age is greater than or equal to 24
        {
            System.out.println( "You can do pretty much anything " + name + ".");
        }

    }
}