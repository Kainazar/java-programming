package day40_arrayList;
import java.util.*;
public class ArrayExample {
    public static void main(String[] args) {

        ArrayList <Integer> nums =  new ArrayList<>();
        nums.add(156); // 0
        nums.add(144); // 1
        nums.add(5);  //  2

        //nums.add("java") ERROR ONLY NUMBERS

        System.out.println("size = " +nums.size());
        // READING FROM ARRAYLIST:
        System.out.println("nums- "  +nums.get(0));
        System.out.println("nums- " + nums.get(1));
        System.out.println("nums- " + nums.get(2));
     //   System.out.println("nums- " + nums.get(3)); OUT OF BOUNDS
        System.out.println(nums);
        System.out.println(nums.get(0)+nums.get(1)+nums.get(2));
      //  nums.remove(1); // REMOVE INDEX OF OR LINE 1 STARTING FROM 0
        System.out.println(nums);




    }
}
