import java.util.Scanner;

public class twoqs
{
    public static void main( final String[] args)
    {
        final Scanner keyboard = new Scanner (System.in);

        String q1, q2, ans;

        ans = "object";

        System.out.println( "Lets play a game of Two Questions! \n Think of an object, and I'll try to guess it.");
        System.out.println( "\n \n Question 1) Is it animal, vegtable or mineral?");
        q1 = keyboard.next();
        System.out.println();

        System.out.println( "Question 2) is it bigger than an bread box?\n");
        q2 = keyboard.next();
        System.out.println();

        if ( q2.equals("yes"))
        {
            if (q1.equals("animal"))
            {
                ans = "moose";
            }
            else if (q1.equals("vegtable"))
            {
                ans = "watermelon";
            }        
            else if (q1.equals("mineral"))
            {
                ans = "Camaro";
            }
        }
        else if( q2.equals("no"))
        {
            if (q1.equals("animal"))
            {
                ans = "squirrel";
            }
            else if (q1.equals("vegtable"))
            {
                ans = "carrot";
            }
            else if (q1.equals("mineral"))
            {
                ans = "paper clip";
            }
            
        }
        else 
        {
            System.out.println("Please type an answer!");        
        }
        
        System.out.println("My guess is that you're thinking of " + ans + ".");
        System.out.println("I would ask you if I'm right, but I don't actually care.");

        
    }
}