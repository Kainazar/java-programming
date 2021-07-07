package day55_abstraction_exercise_example.Interfaces_examples;

public interface WebDriver {
      public abstract void get(String url);
      public abstract void findElements(String locator);
                      void quit();
                      String getTitle();

}
