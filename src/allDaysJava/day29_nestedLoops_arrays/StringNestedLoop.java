package allDaysJava.day29_nestedLoops_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i < word.length(); i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(word.charAt(k));
            }
            System.out.println();

        }
        String word1 = "java";
        for (int i = 0; i < word.length(); i++) {
            for (int k = i; k < word1.length() ; k++) {
                System.out.print(word1.charAt(k));
            }
            System.out.println();
        }


            }
        }







