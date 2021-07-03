package allDaysJava.day45_oop;

public class ConpareingString {
    public static void main(String[] args) {
        String word = "java";
        String word1 = new String("java");
        System.out.println(word == (word1));
            System.out.println("*********************");

            String word2 = "java";
        String word3 = new String("java");
        System.out.println(word2.equals(word3));

        }
    }

