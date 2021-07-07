package day29_nestedLoops_arrays;

public class CountCharNestedLoop {
    public static void main(String[] args) {
        String word = "java";

        for (int outter = 0; outter < word.length(); outter++) {
            int count = 0;
            for (int inner = 0; inner < word.length(); inner++) {

                if (word.charAt(outter) == word.charAt(inner)) {
                    count++;
                }
            }
            System.out.println(word.charAt(outter) + ":" + count);


        }

        }
    }

