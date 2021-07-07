package day40_arrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(); //POLYMORPHIC WAY OF DECLARING
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        nums.add(70);
        nums.add(80);
        nums.add(80);
        nums.add(90);
        nums.add(100);
        //System.out.println("nums.size() = " + nums.size());
        //System.out.println("nums = " + nums);
        nums.remove(9);
        //  nums.remove(88); --> indexOfBounds
        nums.remove(new Integer(90)); // --> removes number 90, not indexOf 90
        nums.remove(new Integer(80));
        // for loop:
        for (int i = 0; i < nums.size(); i++) {
           System.out.println("nums = " + nums.get(i));


            // for each loop:
for (int each : nums){
    System.out.print(each+" ");
}

        }
    }
}
