public class ComparingTwoStrings {
    public static void main(String[] args) {
        String name = "Haider";
        String name1 = "kaider";
        String name2 = "Fred";
        String name3 = new String("Haider");
        System.out.println(name +" "+ name1);
        System.out.println(name.toLowerCase().equals(name1.toLowerCase()));
    }
}
