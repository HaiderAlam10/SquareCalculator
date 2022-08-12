import java.util.Scanner;

public class loginscript {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "password";


        Scanner reader = new Scanner(System.in);
        System.out.print("Enter username: ");
        String usernameEntered = reader.nextLine();
        System.out.println("Username is: " + usernameEntered);


        System.out.print("Enter password: ");

        String passwordEntered = reader.nextLine();
        System.out.println("Password is: " + passwordEntered);


        if (username.equals(usernameEntered) && password.equals(passwordEntered)) {
            System.out.println("You have been validated!");

        } else {
            System.out.println("Access not authorised");
        }

        //As a minimum
        //create a login script
        //take a username
        // take a password
        //compare both to the above
        //if they match display "You have been validated!"
        //If they don't match display "Access not authorised"

        //As an extension
        //Validate the input of the username
        // if they press return without keying any value
        // ask the user to enter a username

        //as a stretch
        //if the user enters the wrong information 3x
        // Display "You have been banned!"
    }
}
