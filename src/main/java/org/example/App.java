package org.example;

// Import scanner
import java.util.Scanner;


public class App 
{
    // Main function
    public static void main( String[] args )
    {
        // Prompt user for input
        System.out.println("What is your name?");

        // Scan in the input to "name"
        Scanner name = new Scanner(System.in);

        // Print greeting
        System.out.println("Hello, " + name.next() + ", nice to meet you!");
    }
}
