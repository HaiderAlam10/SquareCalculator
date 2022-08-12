import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
//        for(int i = 0; i < 20; i = i +1)
//        {
//            System.out.print("value of i : " + i);
//            System.out.print("\n");
//            //enter password
//        }
//        String username = "Admin";
//        //Using a while Loop
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter username: ");
//        String usernameEntered = reader.nextLine();
//        while(usernameEntered.equals("")){
//            //when something happens
//            System.out.println("Enter username: ");
//            usernameEntered = reader.nextLine();
//        }

        String username = "Admin";
        //using a do while loop
        String usernameEntered;
        do {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter username: ");
            usernameEntered = reader.nextLine();
        } while (usernameEntered.equals(""));
    }
}

