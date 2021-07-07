package hiding;

public class Phone {
    String type = "Old school Phone";


    public static void use () {
        System.out.println("Using the Phone");
    }

    public void call () {
        use();
        System.out.println("And making a phone call");
    }
}
