import java.util.Objects;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        System.out.println("What is your Name?");
        Scanner myName = new Scanner(System.in);
        String name = myName.nextLine();
       if (name.equals("Alice") || name.equals("Bob")) {
           System.out.println("Hello " + name + "! So Happy to see you!");
       } else {
           System.out.println("");
       }
    }

}
