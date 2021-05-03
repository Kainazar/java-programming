package OfficeHours.practice_03_31_21;

public class CountJava2 {
    public static void main(String[] args) {
        String str = "java is fun. java class today, not javascript";
        int count = 0;

        // str.substring(0,4)
        // str.substring(1,5)
        // str.substring(2,6)

        for(int i=0; i < str.length()-3; i++) {

            String eachFourLetters = str.substring(i, i+4);
            if(eachFourLetters.equals("java")) {
                count++;
            }
            System.out.println(eachFourLetters);

        }

        System.out.println(count);
    }
}
