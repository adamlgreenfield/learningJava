import java.util.Scanner;

public class twoqs2
{
    public static void main( final String[] args)
    {
        final Scanner keyboard = new Scanner (System.in);

        String q1, q2;

        System.out.print( "Two more questions! \n \n Think of something and I'll try to guess it. \n");
        System.out.print( "Question 1) Does it stay inside or outside or both? ");
        q1 = keyboard.next();

        System.out.print( "Question 2) Is it a living thing? ");
        q2 = keyboard.next();

        if ( q1.equals("inside") && q2.equals("yes"))
        {
            System.out.print( "Then what else could you be thinking of besides a houseplant?!?"); 
        }
        if ( q1.equals("inside") && q2.equals("no") )
        {
            System.out.print( "Then what else could you be thinking of besides a shower curtain?!?");
        }
        if ( q1.equals("outside") && q2.equals("yes") )
        {
            System.out.print( "Then what else could you be thinking of besides a bison?!?");
        }
        if ( q1.equals("outside") && q2.equals("no") )
        {
            System.out.print( "Then what else could you be thinking of besides a bilboard?!?");
        }
        if ( q1.equals("both") && q2.equals("yes") )
        {
            System.out.print( "Then what else could you be thinking of besides a dog?!?");
        }
        if ( q1.equals("both") && q2.equals("no") )
        {
            System.out.print( "Then what else could you be thinking of besides a cell phone?!?");
        }
    }
}