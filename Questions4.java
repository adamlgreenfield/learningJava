import java.util.Scanner; 

public class Questions4
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner (System.in);

        String fname, lname, grade, login;
        Integer ID, GPA; 
        
        System.out.print( "Hello! What is your first name? ");
        fname = keyboard.next();

        System.out.print( "Hello " + fname + ". What is your last name? ");
        lname = keyboard.next();

        System.out.print( "What grade are you in? ");
        grade = keyboard.next();
        
        System.out.print( "What is your student ID number? ");
        ID = keyboard.nextInt();

        System.out.print( "What is your login ID? ");
        login = keyboard.next();

        System.out.print( "What is your GPA? ");
        GPA = keyboard.nextInt();

        System.out.println( "Your information:");
        System.out.println( "   Login:      " + login );
        System.out.println( "   ID number:  " + ID );
        System.out.println( "   Name:       " + lname + ", " + fname);
        System.out.println( "   GPA:        " + GPA );
        System.out.println( "   Grade:      " + grade);
        
    }
}