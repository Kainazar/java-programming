package allDaysJava.day38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
        start();
        count(1);
    }
    public static void
    start(){
        System.out.println("Start");
        continues();
    }
    public static void continues(){
        System.out.println("continue");
        end();
    }
    public static void end(){
        System.out.println("End");
    }
    public static void count( int num){
        System.out.print(num + " ");
        num++;
        if (num <= 100){
            count(num);
        }
    }
}
