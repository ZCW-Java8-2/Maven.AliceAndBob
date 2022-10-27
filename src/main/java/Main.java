import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        //create scanner object
        Scanner scanner = new Scanner(System.in);
        //create Strings for "Alice" and "Bob"
        String name1 = "Alice";
        String name2 = "Bob";
        //create greeting with name input
        System.out.println("Please state your name");
        String input = scanner.nextLine();
        //if input is "Alice" or "Bob"
        if(input.equals(name1) || input.equals(name2)) {
            System.out.println("Hello there " + input);
        //if input is not "Alice" or "Bob"
        } else {
            System.out.println("WHO ARE YOU PEOPLE???");
        }

    }
}
