package day19_class_vs_object_string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import java.util.Locale;

public class StringCaseConvertion {
    public static void main(String[] args) {
        String word = "CyberTEK";
        String sentence = "Java is Fun";
        System.out.println("word = " + word);
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("cybertek".toUpperCase());
        System.out.println(sentence.toUpperCase());


        String wordLcase = word.toLowerCase();
        System.out.println("wordLcase = " + wordLcase);
        word = word.toUpperCase();
        System.out.println("wordLcase = " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase()); // AMAZON
        company = company.toLowerCase();
        System.out.println("company = " + company); // company =  amazon
        company = company.toUpperCase();
        System.out.println("company = " + company); // company = AMAZON
    }
}
