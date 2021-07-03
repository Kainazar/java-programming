package allDaysJava.day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(15, 10);
        addNumbers(20 , 35);
        addNumbers(15343, 184135);
        addNumbers(54463,138463,42632);
    }

    public static void addNumbers(int ... nums){
        int sum = 0;
        for ( int n : nums){
            sum+= n;
        }
        System.out.println("sum = "+ sum);
    }
}
