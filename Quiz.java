import java.util.Scanner;

public class Quiz
{
    public static void main( final String[] args)
    {
        final Scanner keyboard = new Scanner (System.in);

        String ans1;
        int correctCount;
        correctCount = 0;

        System.out.print( "Are you ready for the quiz? Y/N ");
        ans1 = keyboard.next();

        if ( ans1.equals( "Y" ))
        {
                System.out.println( "Q1: What is the capital of Alaska? \n \t 1. Texas \n \t 2. Juneau \n \t 3. France" );
            final int a1 = keyboard.nextInt();

            if ( a1 == 2 )
            {
                correctCount++;
                System.out.println( "Good jeorb! \n Your current score is " + correctCount);
            }
            else 
            {
                System.out.println( "Sorry the correct answer was 2 \n Your current score is " + correctCount);
            }

            System.out.println( "Q2: Can you store the value \"cat\" in a variable of type int? \n \t 1: Yes \n \t 2: No");
            final int a2 = keyboard.nextInt();

            if ( a2 == 2 )
            {
                correctCount++;
                System.out.println( "Great jeorb! \n Your currenct score is " + correctCount);
            }
            else
            {
                System.out.println( "Sorry the correct answer was No \n Your current score is " + correctCount);
            }
            System.out.println( "Q3: What is the result of 9+6/3? \n \t 1) 5 \n \t 2)11 \n \t cat");
            final int a3 = keyboard.nextInt();

            if ( a3 == 2 )
            {
                correctCount++;
                System.out.println( "GREAT JJJJEEEOOOORRRBBBB! \n Your current score is " + correctCount);
            }
            else 
            {
                System.out.println( "Sorry, but not as sorry as your parents. \n Your current score is " + correctCount);
            }

            System.out.println( "Your final is " + correctCount + " out of 3");
        } 
        else 
        {   
            System.out.println( "Fuck off then.");
        }
    }
}