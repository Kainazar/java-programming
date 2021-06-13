package day53_inheritance.hiding;

public class Mobile  extends  Phone {
    String type = "Mobile Phone";


    /**
     * Method hiding.
     * we are hiding use()
     *
     */
    public static void use () {
        System.out.println("Using mobile phone");
    }
    public void text() {
        System.out.println("and sending a text message");
    }
}
