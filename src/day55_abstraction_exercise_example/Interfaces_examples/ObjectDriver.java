package day55_abstraction_exercise_example.Interfaces_examples;

public class ObjectDriver {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://practiceCybertekschool.com");
        chromeDriver.findElements("//a");
        chromeDriver.quit();
        System.out.println("===================================");
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.getTitle();
        firefoxDriver.findElements("//a");
        firefoxDriver.quit();
        System.out.println("===================================");
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new FirefoxDriver();
        driver.getTitle();
        driver1.getTitle();
    }
}
