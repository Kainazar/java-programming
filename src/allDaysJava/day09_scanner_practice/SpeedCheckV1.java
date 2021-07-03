package allDaysJava.day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        byte speedLimit = 55;
        int currentLimit = 60;
        int overTheLimit = currentLimit - speedLimit;
        System.out.println(" You are driving " + overTheLimit + "mph over the limit. SLOW DOWN ");
    }
}
