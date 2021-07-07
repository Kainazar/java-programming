package day38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
        count(1);
    }

    public static void count(int num) {
        System.out.print(num + " ");
        num++;
        if (num < 100) {
            count(num);
            //count(num);
        }
    }
}

