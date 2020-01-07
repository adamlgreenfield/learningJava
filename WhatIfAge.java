import java.util.Scanner; 

public class WhatIfAge
{
    public static void main( final String[] args)
    {
        final Scanner keyboard = new Scanner (System.in);

        int age;
        
        System.out.print( "What is your age?");
        age = keyboard.next();

        if ( age < 16 );
        {   
            System.out.println( "You can't drive.")
        }
        }
    }
}