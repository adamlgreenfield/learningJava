import java.util.Scanner; 

public class WhatIf2
{
    public static void main( final String[] args)
    {
        final Scanner keyboard = new Scanner (System.in);

        int age;
        
        System.out.print( "What is your age?");
        age = keyboard.nextInt();

        if ( age < 16 )
        {   
            System.out.println( "You can't drive.");
        }
           
        if ( age >= 16 )
        {
            System.out.println( "You can drive.");
        }
        if ( age < 18 )
        {   
            System.out.println( "You can't vote.");
        }

        if ( age >= 18 )
        {
            System.out.println( "You can vote.");
        }

        if ( age < 25 )
        {
            System.out.println( "You can't rent a car.");
        }

        if ( age >= 25 )
        {
            System.out.println( "You can do anything that is legal.");
        }

    }
}
