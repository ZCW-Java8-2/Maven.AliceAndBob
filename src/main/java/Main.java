import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        System.out.println("What is your name");
        // Create new scanner object called inputObject.
        Scanner inputObject =  new Scanner(System.in);
        // Create new variable "name" and stores the user input "inputObject"
        String name = inputObject.nextLine();
        // Prints the output "Your name is" and includes the variable "username" which is any name.
        System.out.println("Your name is " + name + ".");

        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("Sorry, " + name + " was not found.");
        }







    }
}
