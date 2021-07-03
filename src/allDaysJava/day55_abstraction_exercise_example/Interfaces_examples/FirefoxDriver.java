package allDaysJava.day55_abstraction_exercise_example.Interfaces_examples;

public class FirefoxDriver implements  WebDriver {

    @Override
    public void get(String url) {
        System.out.println("ChromeDriver - will close all Browser ");
    }

    @Override
    public void findElements(String locator) {
        System.out.println("ChromeDriver - navigate to "+ locator);
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver - will close all Browser ");
    }

    @Override
    public String getTitle() {
        return "Wooden Spoon ";
    }
}
