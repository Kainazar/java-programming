package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        //print each letter using a loop
        for(char each : letters) {
            System.out.print(each + " ");
        }

        String sentence = new String(letters);
        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());
        //  0            1         2       3       4         5
        String[] fruits = {"bananas" , "apples", "kiwi", "mango", "papaya", "strawberry"};

        //"bananas-apples-kiwi-mango-papaya-strawberry-"
        String fruitStr = "";

        for(String each : fruits) {
            System.out.print(each +"-");
            fruitStr += each + "-";
        }

        System.out.println("\nfruitStr = " + fruitStr);

        String[] languages = {"java", "python" , "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("",languages));
        System.out.println(String.join("##",languages));
        String joinedLanguages = String.join(" <> " , languages);
        System.out.println("joinedLanguages = " + joinedLanguages);
//        **Arrays→ Arrays class**
//
//        - When we have char array, we can create a String out of it, it will automatically join each letter into a single string
//
//                **CONVERT CHAR ARRAY INTO STRING**
//
//        - Just create a new String with char array in constructor
//
//        Example:
//
//        char[] grades = {'A', 'B', 'C', 'D', "E'};
//
//                String gradesStr = new String(grades);
//
//        gradesSTr → "ABCDE";
//
//**CONVERT STRING INTO CHAR ARRAY**
//
//        example:
//
//        String item = "wooden spoon";
//
//        item.toCharArray();
//
//        char[] itemArray = item.toCharArray();
//
//        itemArray → 'w', 'o', 'o', 'd', 'e', 'n', ' ', 's', 'p', 'o', 'o', 'n'
//
//                - ANY string that we write in java, is a char array internally for String class
//        - String class internally uses char array to handle characters within double quote
//
//        Example:
//
//        String word = "git";
//
//        How to convert str to char[] array?
//
//        char[] letters = str.toCharArray();
//
//        letters ⇒ 'g', 'i', 't'
//        some notes
    }
}
