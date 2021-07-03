package allDaysJava.day59_polymorphism_exceptions.exception_handling;

public class RunTimeErrorExample {
    public static void main(String[] args) {
        System.out.println(10 / 2);
      //  System.out.println(10 / 0);
        System.out.println(10 / 3);


        int [] nums = {3,4,7};
        System.out.println(nums[2]);
        System.out.println(nums[3]); // ArrayIndexOutOfBoundsException: 3



    }
}
