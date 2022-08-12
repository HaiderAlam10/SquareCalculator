public class ifstatement2 {
    public static void main(String[] args) {
//        int number = 5;
//        if (number == 1)
//        {
//            System.out.println("The number is one.");
//        }
//        else if (number == 2)
//        {
//            System.out.println("The number is two.");
//        }
//        else if (number == 3)
//        {
//            System.out.println("The number is three!");
//        }
//        else
//        {
//            System.out.println("Too much buddy");
//        }
        // here are two methods of choice
        int number = 3;
        switch (number){
            case 1:
                System.out.println("Number equals one");
                break;
            case 2:
                System.out.println("Number equals two");
                break;
            case 3:
                System.out.println("Number equals three");
                break;
            default:
                System.out.println("Quite a lot!!!");
        }
    }
}
