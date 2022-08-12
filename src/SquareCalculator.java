import java.util.Scanner;

public class SquareCalculator {

    public static void main(String[] args) {
        double width = (13.5);
        double height = (25.3);
        System.out.println(13.5);
        System.out.println(25.3);
        double perimeter = 2 * width + 2 * height;
        System.out.println("perimeter of rectangle is: " +perimeter);

        double area = (width*height);
        System.out.println("area is" +area);
    // Task 1 - need assistance not sure exactly where to put the code below
        Scanner reader = new Scanner(System.in);
        System.out.println("What is the width:");
        String firstName = reader.nextLine();
        System.out.println("What is the height:");
    }
}