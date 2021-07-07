package day35_method_tiwh_param;

public class Counters {
    public static void main(String[] args) {
count(5);
count(7);
count(10);
int num1 = 100;
count(num1);
String word = "WOODEN SPOON";
count(word.length());
printAge(1986);

    }

    public static void count(int num) {
        for (int i = 0; i <=num; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void printAge(int year){
        int age = 2021-year;
        System.out.println("Birth year: "+ year + ". Age: "+ age);
    }
}
