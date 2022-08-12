public class ifstatement {
    public static void main(String[] args) {
        String name = "haider ";
        String anotherName = new String();
        anotherName = "Haider";
        String name1 = "Fred";

        if (anotherName.equals(name)) {
            System.out.println("Yahoo! Name equals Haider");
        }
        else {
            System.out.println("Name does not equal Haider");
        }
    }
}
