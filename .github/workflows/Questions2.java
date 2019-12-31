import java.util.Scanner; 

public class Questions2
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner (System.in);

        System.out.print( "Give me a word? ");
        keyboard.next();

        System.out.print( "Give me another word! ");
        keyboard.next();

        System.out.print( "Feed me a number!");
        keyboard.nextDouble();

        System.out.print( "Now another number");
        keyboard.nextDouble();

       System.out.println ( "Now wasn't that fun!");
    }
}