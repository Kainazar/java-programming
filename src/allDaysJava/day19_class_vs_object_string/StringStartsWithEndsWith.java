package allDaysJava.day19_class_vs_object_string;

public class StringStartsWithEndsWith {
    public static void main(String[] args) {
        String word = "Cybertek";
        System.out.println(word.startsWith("Cybertek")); // true
        System.out.println(word.endsWith("k"));    // true
        System.out.println(word.startsWith("C"));  // true
        System.out.println(word.endsWith("tek"));  // true
        System.out.println(word.endsWith("Cy"));  // false
        System.out.println(word.startsWith("be"));// false


        String firstName = "Sr";
        if (firstName.startsWith("Dr")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Mrs")) {
            System.out.println("Married Woman");
        } else if (firstName.startsWith("Jr")) {
            System.out.println("Junior");
        } else if (firstName.startsWith("Ms")) {
            System.out.println("Single woman");
        } else if (firstName.startsWith("Sr")) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid abbreviation");
        }
        /**sfjhkjfsk




        */
            String website = "ch";
            if (website.endsWith("gov")) {
                System.out.println("Goverment website");
            } else if (website.endsWith("com")) {
                System.out.println("Commercial website");
            } else if (website.endsWith("edu")) {
                System.out.println("Education website");
            } else if (website.endsWith("kg")) {
                System.out.println("KG website");
            } else if (website.endsWith("ch")) {
                System.out.println("Switzerland website");
            }else {
                System.out.println("Invalid domain");
            }


    }
}
