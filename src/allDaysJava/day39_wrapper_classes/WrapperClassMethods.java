package allDaysJava.day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(50,20));
        System.out.println("Max int" +Integer.MIN_VALUE);
        System.out.println("Min int"+ Integer.MAX_VALUE);
        System.out.println(Double.max(235.5, 23.9));
        System.out.println("Max double "+ Double.MAX_VALUE);
        System.out.println("Min double "+ Double.MIN_VALUE);
        System.out.println(Double.compare(5, 5));
        System.out.println(Double.compare(5, 1));
        System.out.println(Double.compare(5, 45));
        System.out.println(Character.isDigit('7'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isAlphabetic('9'));
        System.out.println(Character.isLetter('d'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter('1'));
        char letter = 'a';
        Character letter1 = letter;
        System.out.println(Character.isLetter(letter1));

        String word ="JaVa IS FuN";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i) + ", ");
            }

        }
        System.out.println();
        System.out.println(Boolean.TRUE.equals(5>3));

    }
}
