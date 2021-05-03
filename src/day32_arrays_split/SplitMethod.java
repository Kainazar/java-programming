package day32_arrays_split;
import java.util.*;
public class SplitMethod {
    public static void main(String[] args) {
        String words = "Java:python:selenium:html";
        String []wordsArray=  words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length = "+ wordsArray.length);


        String sentence = "today i am coding java arrays";
        String [] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("length of sentence: "+ sentenceArray.length);

        for ( String each : sentenceArray){
            System.out.println("each = " + each);
        }

        String cats = "bengal cat tabby cat persian cat no cat here";
        String [] myshykArray =cats.split("cat");
        System.out.println(Arrays.toString(myshykArray));
        }


    }

