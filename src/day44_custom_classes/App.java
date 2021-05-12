package day44_custom_classes;

public class App {
    public static void main(String[] args) {
        MyApp uberApp = new MyApp();

        uberApp.name = "Uber";
        uberApp.version = 3.5;
        uberApp.open();
        uberApp.version = 4.0;
        uberApp.open();

    }
}
