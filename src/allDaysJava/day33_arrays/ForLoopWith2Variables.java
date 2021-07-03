package allDaysJava.day33_arrays;

public class ForLoopWith2Variables {
    public static void main(String[] args) {
        int [] nums = {10, 15, 25, 35};

        for(int i =1, j = 1; i <=4; i++, j++){
            System.out.println("i = " + i+ ", j = " + j);
            System.out.println(nums);
        }
        System.out.println("===== 2 way for loop           ======");
for (int i = 1, j = 5; j >= 0 ; i++, j--){
    System.out.println("i = " + i+ ", j = " + j);
}


    }
}
