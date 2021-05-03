package day29_nestedLoops_arrays;

public class ArrayIntro {
    public static void main(String[] args) {
                           int num =10; //single variable
        int [] nums = new int [3];//array variable
        // [3] mean ,this array can hold 3 int values
        nums[0]= 15;
        nums[1]= 25;
        nums[2]= 10;

        // print values of array
        System.out.println("values at index 0 = " + nums[0]);
        System.out.println("values at index 0 = " + nums[1]);
        System.out.println("values at index 0 = " + nums[2]);

        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println("i = " + i);
        nums[0]= 100;
        nums[1]= 300;
        nums[2]= nums[1];
        System.out.println("nums = " + nums[0]);
        System.out.println("nums = " + nums[1]);
        System.out.println("nums = " + nums[2]);



    }
}
