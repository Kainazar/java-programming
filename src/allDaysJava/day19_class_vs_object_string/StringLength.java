package allDaysJava.day19_class_vs_object_string;

public class StringLength {
    public static void main(String[] args) {
        String firstName = "kainazarov";
        System.out.println(firstName +"-"+ firstName.length());
        System.out.println(firstName.toUpperCase());
        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "Hello";
        if(password.length()>= 6){
            System.out.println("Valid Amazon password");
        }else{
            System.out.println("password must be at least 6 character");
        }

    }
}
