package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10); // true 10 equal 10
        System.out.println(1000>100); // true 1000 is greater then 100
        System.out.println(500<777); // true
        System.out.println(10<=10); // true
        System.out.println( 5>=3); // true
        System.out.println(-100 !=44); //true -100 is not equal 44
        System.out.println();
        int a = 100;
        int b = 200;
        System.out.println(a==b);  //false // only == not 3.
        System.out.println(a < b); // true
        System.out.println(b > a); // true
        System.out.println(a <= b);// true
        System.out.println(a != b);// true
        
        boolean result= 5==5; //true
        System.out.println("result = " + result); // true

        result = 33 > 34;
        System.out.println("result = " + result); // false

        result = 88 < 99;
        System.out.println("result = " + result); // true

        result = 10 >= 10;
        System.out.println("result = " + result); // true

        result = 100 != 99;
        System.out.println("result = " + result); // true

        String city = "Seattle";
        System.out.println(city == "Seattle"); // true
        System.out.println(city == "Bishkek"); // false
        System.out.println(city != "country"); // true
        
        String name= "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName); // true
        
        checkName = name != "Kuzzat";
        System.out.println("checkName = " + checkName);
        
       


    }
}
