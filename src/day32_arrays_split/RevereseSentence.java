package day32_arrays_split;

public class RevereseSentence {
    public static void main(String[] args) {
        String sentence = "today is java";
        String[] words = sentence.split(" ");// "" words or letter will print {'t','o','d','a','y'}
        String reversed = "";
        //print words array in reverse order
        for(int i = words.length - 1; i >= 0; i--) {
            //System.out.print(words[i] +" ");
            reversed += words[i] + " ";
        }
        System.out.println("sentence = " + sentence);
        System.out.println("reversed = " + reversed);

    }
}
