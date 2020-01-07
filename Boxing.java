import java.util.Scanner;

public class Boxing
{
    public static void main( final String[] args)
    {
        final Scanner keyboard = new Scanner (System.in);

        int weight, planet;
        Double Venus = .78; 
        Double Mars = .39; 
        Double Jupiter = 2.65;
        Double Saturn = 1.17; 
        Double Uranus = 1.05;
        Double Neptune = 1.23;
        

                
        System.out.print( "What is your current weight?");
        weight = keyboard.nextInt();
        
        System.out.println();
        System.out.println( "I have information on the following planets:");
        System.out.println( "   1. Venus    2. Mars     3. Jupiter");
        System.out.println( "   4. Saturn   5. Uranus   6. Neptune");
        System.out.println();
        planet = keyboard.nextInt();

        if ( planet == 1 )
        {
            System.out.println( "You weigh: " + weight * Venus + " pounds on Venus.");
        }
        else if ( planet == 2 )
        {
            System.out.println( "You weight: " + weight * Mars + " pounds on Mars.");
        }
        else if ( planet == 3)
        {
            System.out.println( "You weigh: " + weight * Jupiter + " pounds on Jupiter.");
        }
        else if ( planet == 4 )
        {
            System.out.println( "You weigh: " + weight * Saturn + " pounds on Saturn.");
        }
        else if ( planet == 5 )
        {
            System.out.println( "You weigh: " + weight * Uranus + " pounds on Uranus.");
        }
        else ( planet == 6 )
        {
            System.out.println( "You weigh: " + weight * Neptune + " pounds on Neptune.");
        }
    }
}
