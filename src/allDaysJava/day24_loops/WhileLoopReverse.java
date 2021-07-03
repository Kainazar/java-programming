package allDaysJava.day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) throws InterruptedException {
//        int count = 5;
//        while (count >= 0) {
//            System.out.println("count = " + count--);
//            Thread.sleep(100);
//        }
//        System.out.println("Finished the  " + count);

        int unreadSMS = 10;
        while (unreadSMS >0) {
            System.out.println("I have total  " +unreadSMS+ " unread sms");
            unreadSMS--;
        }
        System.out.println("You do not have any messages ");
    }
}
