package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int stars = 0; // #1
                stars <=15; // # 2
                                           stars++){ // # 4
            System.out.print("\uD83C\uDf1F * ");// # 3
        }
        String myStars = "";
        System.out.println();
        for (int i = 0; i <=5; i++) {
            myStars += "\uD83C\uDf1F ";

        }
        System.out.println("my stars = " + myStars);

    }
}


