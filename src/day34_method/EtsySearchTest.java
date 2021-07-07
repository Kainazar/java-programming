package day34_method;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting Etsy Search Smoke Test--");
openBrowser();
navigateToEtsyUrl();
searchForWoodenSpoon();
verifyResultsAreDisplayed();
    }
    public static void openBrowser(){
        System.out.println("1# --> Open google chrome browser to search the web");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("2# --> Click on the search bar and navigate to etsy URL(https://www.etsy.com/)");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("3# --> Click on the search bar in etsy and search for \"Wooden Spoon\"");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("4# --> Verify that you received results of wooden spoons on the page!");
    }
}



//    openBrowser
//            navigateToEtsyUrl
//    searchForWoodenSpoon
//            verifyResultsAreDisplayed