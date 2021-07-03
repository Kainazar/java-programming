package allDaysJava.day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        //1 second = 1_000_000_000 nanoseconds
        long start = System.nanoTime(); //get starting time
        List<Integer> mlnNums = getIntegerList();//returns ready ArrayList object. no need new Arra..
        long end = System.nanoTime(); //get ending time
        double listSeconds = (end - start) / 1_000_000_000.0;
        System.out.println("ArrayList time = " + (end - start)); //print duration
        System.out.println("ArrayList seconds = " + listSeconds);

        long st = System.nanoTime(); //start
        int[] arr = getIntegerArray();
        long en = System.nanoTime(); //end
        double seconds = (en - st) / 1_000_000_000.0;
        System.out.println("Array time = " + (en - st));
        System.out.println("Array time seconds = " + seconds);


        //System.out.println(mlnNums);

    }
    /**
     * getIntegerList
     * No params
     * return List<Integer>
     *    Loop from 0 - 1000_000
     *    and add to arraylist then return it
     */
    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i <= 1_000_000; i++) {
            nums.add(i);
        }
        return nums;
    }

    /**
     * getIntegerArray
     * No params
     * return int[]
     *    Loop from 0 - 1000_000
     *    and add to int[] then return it
     */
    public static int[] getIntegerArray() {
        //declare empty array with size - 1_000_001
        int[] nums = new int[1_000_001];
        //loop and assign numbers
        for(int i = 0; i <= 1_000_000; i++) {
            nums[i] = i;
        }
        return nums; //return
    }

    /**
     * getDays
     */

}

