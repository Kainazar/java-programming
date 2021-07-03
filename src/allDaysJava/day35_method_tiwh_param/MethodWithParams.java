package allDaysJava.day35_method_tiwh_param;

public class MethodWithParams {
    public static void main(String[] args) {
        displayValue(11);
        displayValue(77);
        displayValue(33);
        displayValue(88);
        displaySum("java is fun");
        greetByName("Hello World");
        greetByName1("How Are You Today?");
        greetByName2("Bakyt");
        greetByName2("B22");
        String name= "Kainazar";
        greetByName2(name);

    }
    public static void displayValue(int num){
        System.out.println("number = " + num) ;
    }
    public  static  void displaySum(String num1){
        System.out.println("num1 = " + num1);
    }
    public static void greetByName(String word){
        System.out.println("word = " + word);
    }
    public static void greetByName1( String name){
        System.out.println("name = " + name);
    }
    public  static  void greetByName2(String name1){
        System.out.println("Hello "+ name1+ " how are you Today? ");
    }


    }

