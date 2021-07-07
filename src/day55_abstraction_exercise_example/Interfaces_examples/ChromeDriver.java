package day55_abstraction_exercise_example.Interfaces_examples;

public class ChromeDriver implements WebDriver {
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver "+ url);
    }

    @Override
    public void findElements(String locator) {
        System.out.println("FirefoxDriver - navigate to "+ locator);

    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver - will close all Browser ");

    }

    @Override
    public String getTitle() {
        System.out.println("FirefoxDriver - will get us Title");
        return "Wooden Spoon title ";
    }
}
