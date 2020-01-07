import java.util.Scanner;

public class 2qs
{
    public static void main( final String[] args)
    {
        final Scanner keyboard = new Scanner (System.in);

        String q1, q2, answer;

        System.out.print( "Two more questions! \n \n Think of something and I'll try to guess it. \n");
        System.out.print( "Question 1) Does it stay inside or outside or both? ");
        q1 = keyboard.next();

        System.out.print( "Question 2) Is it a living thing? ");
        q2 = keyboard.next();

        if ( q1 == "inside" && q2 == "yes" )
        {
            System.out.print( "Then what else could you be thinking of besides a houseplant?!?"); 
        }
        if ( q1 == "inside" && q2 == "no" )
        {
            System.out.print( "Then what else could you be thinking of besides a shower curtain?!?");
        }
        if ( q1 == "outside" && q2 == "yes" )
        {
            System.out.print( "Then what else could you be thinking of besides a shower bison?!?");
        }
        if ( q1 == "outside" && q2 == "no" )
        {
            System.out.print( "Then what else could you be thinking of besides a bilboard?!?");
        }
        if ( q1 == "both" && q2 == "yes" )
        {
            System.out.print( "Then what else could you be thinking of besides a shower dog?!?");
        }
        if ( q1 == "both" & q2 == "no" )
        {
            System.out.print( "Then what else could you be thinking of besides a shower cell phone?!?");
        }
        else 
        {
            System.out.print( "You fucked something up.");
        }
    }
}