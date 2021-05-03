package OfficeHours.Practice_04_27_21;

public class Armstrong {
    /**
     * Create a method that will accept a number and determine if that number is an Armstrong number or not.
     * * Return a boolean.
     * *
     * * A number is an Armstrong number if the single digits of the number raised to the power of the number
     * * of digits is equal to the original number
     * *
     * *     Ex:
     * *         153
     * *     Each digit: 1 5 3
     * *     is raised to the power of the number of digits
     * *     153 has 3 digits so each single digit gets raised by 3:
     * *     Calculation is: (1^3), (5^3), (3^3)
     * *     Then the addition of each part is added:
     * *     1^3 + 5^3 + 3^3 => 1 + 125 + 27 = 153
     * *     and so the total value of the calculation is 153 which is equal to the original number,
     * *     which means 153 is an Armstrong number
     */
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    public static boolean isArmstrong(int num) {
        String strNum = "" + num;
        int power = strNum.length();
        int sum = 0;

        for (int i = 0; i < strNum.length(); i++) {
            //  int temp = 1;
            int eachDigit = Integer.parseInt(strNum.substring(i, i + 1));
            sum += Math.pow(eachDigit, power);  // 1 ^ 3 = 1 * 1 * 1
            // 5 ^ 3 = 5 * 5 * 5
//            for(int j = 0; j < power; j++) {
//                temp *= eachDigit;
//            }
        }

        return num == sum;

    }
}