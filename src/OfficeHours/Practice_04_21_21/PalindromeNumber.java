package OfficeHours.Practice_04_21_21;

public class PalindromeNumber {
    public static void main(String[] args) {
//        System.out.println(112 % 1);
//        System.out.println(112 % 10);
//        System.out.println(112 % 100);

        System.out.println(isPalindrome(1234321));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0; // 43
        int temp = number; // 123

        while (temp != 0) {

            int lastDigit = temp % 10; // 3
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
             System.out.println(reverse);
        }
        return reverse == number;
    }


}
/**[IQ] Palindrome number

 1234321

 -> Approach: Reverse the number with some math
 -> Check is reverse the same as the original

 -> This gives the last digit: number % 10 -> 1

 1234321 | number % 10 -> 1
 1234321 | number / 10 -> 123432

 123432 | number % 10 -> 2
 123432 | number / 10 -> 12343

 12343 | number % 10 -> 3
 12343 | number / 10 -> 1234

 rev = 1
 2
 rev  * 10 -> 10 + 2 -> 12

 rev  * 10 -> 120 + 3 -> 123
 *
 *
*/