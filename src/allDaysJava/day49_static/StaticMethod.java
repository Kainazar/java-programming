package allDaysJava.day49_static;

public class StaticMethod {
    public static void main(String[] args) {
        // 1) STATIC METHOD CAN BE CALLED USING CLASS NAME;
        StaticMethods.displayMessage("WOODEN SPOON");
        // 1)  instance method needs an object to be called
        //  StaticMethods.instanceMethod("dskjhfkjs");

        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

    }
}
