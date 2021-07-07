package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println(total);

        String str = "158";
        int count1 = Integer.parseInt(str);
        System.out.println(str);

        String str1 = "555";
        double num1 = Double.parseDouble(str1);
        System.out.println(str1);

        String strPrice ="125.5";
        double price = Double.parseDouble(strPrice);
        if (price> 100);
        System.out.println("price is good");

        String sentence = "We wrote 100 lines of code 500";
        String [] words = sentence.split(" ");
        int  linesOfCode = Integer.parseInt(words[6]);
        System.out.println(linesOfCode);


    }
}
