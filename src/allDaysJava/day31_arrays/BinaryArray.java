package allDaysJava.day31_arrays;
import java.util.*;
public class BinaryArray {
    public static void main(String[] args) {

        int []nums = {15, 29, 36, 48, 56,123,1209};
        System.out.println(Arrays.binarySearch(nums,15));
        System.out.println(Arrays.binarySearch(nums,36));
        System.out.println(Arrays.binarySearch(nums,31)); //-3
        System.out.println(Arrays.binarySearch(nums,50));//-5
// check if number 12345 is among number in array.

        if (Arrays.binarySearch(nums, 123456) >= 0) {
            System.out.println("12345 is present in array");
        }else{
            System.out.println("12345 is not present");
        }

    }
}
