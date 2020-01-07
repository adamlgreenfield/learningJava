import java.util.Scanner;

public class Adventure
{
    public static void main ( final String[] args)
    {
        final Scanner keyboard = new Scanner (System.in);

        String r1, r2, r3, r4, r5, r6, r7;

        System.out.println( "Welcome to the Baby Yoda Adventure game! \n <(°.°)>");
        System.out.println( "\n \n \n Lets start! \n \n You are The Mandalorian, mysterious bounty hunter. \n you've been given the mission to find and kill your latest bounty.");
        System.out.println( "\n After battling through the guards you come across your target. Its a small Baby Yoda.");
        System.out.println( "\n <(°.°)> \n 'coo' he says to you. \n Do you 'save' the Baby Yoda or do you 'kill' the Baby Yoda and dissappoint the entire galaxy?");
        r1 = keyboard.next();
        System.out.println();
        
        if (r1.equals("save"))
        {
            System.out.println( "You pick up 'lil BY' and tuck him under your cloak.");
            System.out.println( "Now you can either 'turn' him in and collect the bounty or you can 'rescue' him and try to take him home.");
            r2 = keyboard.next();
            System.out.println();

            if (r2.equals("rescue"))
            {
                System.out.println( "You decide to save the little guy because you're not literally Hitler. \n <(°.°)> 'coo' \n But now you have to decide what you want to do with him.");
                System.out.println( "You can either 'team up' or you can try to get him 'home'. Wherever that may be.");
                r3 = keyboard.next();
                System.out.println();

                if (r3.equals("team up"))
                {
                    System.out.println( "You decide to team up. You and BB-Yoda fly around the galaxy collecting bounties while he eats frogs and is cute.");
                    System.out.println( "Game over - Great job, you win! Best ending. <(°u°)>");
                }
                else if (r3.equals("home"))
                {
                    System.out.println ( "With a heavy heart you seek out BeBe Yoda's home world. \n While on your ship Lil Yoder starts playing with the buttons and lights.");
                    System.out.println ( "Overcome with his cuteness, you decide to keep him around and go on adventures together.");
                    System.out.println ( "Game over - Good job, you win! Good ending. <(°.°)>");
                }
                else 
                {
                    System.out.println("Ya dun fucked up, type an option in the ''s and start over.");
                }
            }
            else if (r2.equals("turn"))
            {
                System.out.println( "You decide to not kill him, but instead to turn him over to the scientists, you callous monster.");
                System.out.println( "As you speed away ");
            }
            else 
            {
                System.out.println("Ya dun fucked up, type an option in the ''s and start over.");
            }
        }
        else if (r1.equals("kill"))
        {
            System.out.println( "Okay hitler.");
        }
        else 
        {
            System.out.println("Ya dun fucked up, type an option in the ''s and start over.");
        }
    }
}