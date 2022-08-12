import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What is your first name: ");
        String firstName = reader.nextLine();
        System.out.println("What is your last name: ");
        String lastName = reader.nextLine();
        System.out.println("What is your age: ");
        int age = reader.nextInt();
        System.out.println("Your name is" + firstName + " " + lastName);
        int nxtYr = age + 1;
        System.out.println("Your age next year is going to be: " + nxtYr);
    }
}