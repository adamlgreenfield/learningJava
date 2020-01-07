import java.util.Scanner;

public class HowOld
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

        if ( age < 16 )
        {
            System.out.println( "You can't drive " + name + ".");
        }
        else if ( age >= 16 && age <= 17 )
        {
            System.out.println( "You can drive but can't vote "  + name + ".");
        }
        else if ( age >= 17 && age < 24 )
        {
            System.out.println( "You can vote but not rent a car" + name + ".");
        }
        else if ( age >= 24 )
        {
            System.out.println( "You can do pretty much anything" + name + ".");
        }

    }
}