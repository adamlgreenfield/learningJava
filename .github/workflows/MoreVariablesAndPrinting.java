public class MoreVariablesAndPrinting
{
    public static void main( String[] args)
    {
        String Name, Eyes, Teeth, Hair;
        int Age, Height, Weight;

        Name = "Brock Roundhouser";
        Age = 35;     //Totally a lie.
        Height = 84;  //Solid
        Weight = 250; //with ham fists
        Eyes = "Smouldering";
        Teeth = "Mostly missing."; //Lost in fight with bear.
        Hair = "Always somehow waving in the wind.";

        System.out.println( "Let's talk about " + Name + ".");
        System.out.println( "He's " + Height + " inches long.");
        System.out.println( "He's " + Weight + " American pounds heavy.");
        System.out.println( "It's mostly dick.");
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee.");

        //Tricky line next one, reminds me of the bear.

        System.out.println( "If I add " + Age + "," + Height + ", and " + Weight + " I get " + (Age + Height + Weight) + ".");

        System.out.println( (Height) + " inches is " + (Height / 12) + "feet." );
    }
}