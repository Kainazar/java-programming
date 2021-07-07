package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den wooden spoon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.replace(" ","").toUpperCase());

        String city = "new york";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));


    }
}
