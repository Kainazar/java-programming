package allDaysJava.day19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        System.out.println(city.equals("Chicago")); // true
        System.out.println(city.equals("chicago")); // false case sensitive

        // Ignore case
        System.out.println(city.equalsIgnoreCase("chicago")); // TRUE
        System.out.println(city.equalsIgnoreCase("Chicago")); // TRUE
        System.out.println(city.equalsIgnoreCase("chicaGO")); // TRUE
        System.out.println(city.equalsIgnoreCase("CHICAGO")); // TRUE
        System.out.println(city.equalsIgnoreCase("Chi cago "));// false because space
        if(city.equals("CHICAGO")){
            System.out.println("true");
        }else{
            System.out.println("false");
        } if( city.equalsIgnoreCase("CHICAGO")){
            System.out.println("true!!!");
        }else{
            System.out.println("False!!!");
        }

        }
    }

