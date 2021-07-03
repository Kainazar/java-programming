package allDaysJava.day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        System.out.println("Full Name - " + fullName() + ".\nIs Married? - " + isMarried() + "\nHow old are you?  " + getAge() + "!");
        System.out.println("getRandomYear() = " + getRandomYear());
        String name = fullName();
        boolean notMarried = isMarried();
        int age = getAge();
        int year = getRandomYear();
        System.out.println("======================");
        System.out.println("name = " + name);
        System.out.println("notMarried = " + notMarried);
        System.out.println("age = " + age);
        System.out.println("year = " + year);
        if (isMarried()){
            System.out.println("Married");
        }else{
            System.out.println("No Married");
        }

    }

    public static String fullName() {
        return "Mike Smith";
    }

    public static boolean isMarried() {
        return true;
    }

    public static int getAge() {
        int age = 35;
        return age;
    }

    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
       return randomYear;

    }
}
