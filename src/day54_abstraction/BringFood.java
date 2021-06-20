package day54_abstraction;

public class BringFood {
    public static void main(String[] args) {
        Salat salat = new Salat();
        salat.prepare();
        salat.serve();


        Pizza piz = new Pizza();
        piz.prepare();
        piz.serve();
    }
}
