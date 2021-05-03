package practice_my_self;

import java.util.*;

class Main {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner scan = new Scanner(System.in);
        String amOrPm ;
        int inputSecond =86400;
        int hours = inputSecond/3600;
        int minutes = inputSecond%3600/60;
        int seconds = inputSecond%3600%60;


        //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
        Scanner sc = new Scanner(System.in);
        hours  = sc.nextInt();
        minutes = sc.nextInt();
        seconds = sc.nextInt();
        amOrPm = sc.next();
        //#############################

        //2. WRITE YOUR CODE HERE:
        System.out.println(hours + minutes +seconds+amOrPm);




    }
}