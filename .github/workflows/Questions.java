import java.util.Scanner; 

public class Questions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner (System.in);

        int age, feet, inches;
        double weight;

        System.out.print( "How old are you? ");
        age = keyboard.nextInt();

        System.out.print( "How tall are you? (Feet?) ");
        feet = keyboard.nextInt();

        System.out.print( "Inches?");
        inches = keyboard.nextInt();

        System.out.print( "How much do you weigh? ");
        weight = keyboard.nextDouble();

        System.out.println ( "So you're " + age + " and are " + feet + "  feet and " + inches + " inches tall and weigh " + weight + " pounds.");
    }
}