package allDaysJava.day59_polymorphism_exceptions.exception_handling;

public class TryCatch {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        int[] divide = {0, 2, 5};

        for (int i = 0; i < nums.length; i++) {
            try {
                System.out.println(nums[i] / divide[i]);
            } catch (ArithmeticException ex) {
                System.out.println("You cant divide: " + i);
            }

        }
    }
}
