/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 01 - Saying Hello
 */

package base;

// Import scanner
import java.util.Scanner;

public class App 
{
    // Main function
    public static void main( String[] args )
    {
        // Prompt user for input
        System.out.println("What is your name?");

        // Scan in the input to "name" and concat inside msg
        Scanner name = new Scanner(System.in);
        String msg = "Hello, " + name.nextLine() + ", nice to meet you!";

        // Print greeting
        System.out.println(msg);
    }
}
