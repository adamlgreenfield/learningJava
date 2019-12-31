import java.util.Scanner; 

public class Questions3
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner (System.in);

        String name;
        Double salary;
        Integer age;

        System.out.print( "Hello! What is your name? ");
        name = keyboard.next();

        System.out.print( "Hello " + name + ". What is your age? ");
        age = keyboard.nextInt();

        System.out.print( "What is your salary?");
        salary = keyboard.nextDouble();        

        System.out.println( "Your name is " + name + " and you are " + age + " years old. And you make " + salary + ".");
    }
}