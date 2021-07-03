package allDaysJava.day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        repeatString("java", 5, '|');
        repeatString("Hi", 5, '*');
    }

    public static void repeatString(String word, int times, char delimiter) {
        String repeat = "";

        for (int i = 0; i < times; i++)
            repeat += word + delimiter;
            System.out.println(repeat);

        }


    }




