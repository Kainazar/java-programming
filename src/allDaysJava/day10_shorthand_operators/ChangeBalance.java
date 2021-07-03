package allDaysJava.day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = $ " + balance);
        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        baklava = balance - baklava;
        System.out.println("balance after baklava = " + baklava);
        double kenafe = 44.45;
        System.out.println("kenaffa = " + kenafe);
        balance = balance - kenafe;
        System.out.println("balance after kenaffe " + balance);
        kenafe = kenafe / 2;
        System.out.println("kenafe = " + kenafe);
        //buy it and decrease balance with kenafe price
        balance = balance - kenafe;
        System.out.println("balance after second kenafe = " + balance);
        double plov = 7.99;
        System.out.println("plov = $ " + plov);
        balance = balance - plov;
        System.out.println("balance after plov  " + balance);
        double icedTea = 3.0 ;
        balance = balance - (icedTea * 4);
        System.out.println("icedTea = " + icedTea);
        System.out.println("balance after 4 iced Teas $ " + balance);
        balance = balance + baklava;
        System.out.println("balance after returning baklava = " + baklava);
    }

}
