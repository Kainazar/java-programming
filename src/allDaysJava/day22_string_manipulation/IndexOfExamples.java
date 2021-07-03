package allDaysJava.day22_string_manipulation;

public class IndexOfExamples {
    public static void main(String[] args) {
        String technologies = "java, html, Css, selenium, testng, maven, Cucumber";
        // first comma
        System.out.println(technologies.indexOf(",")); //4
        // last comma
        System.out.println(technologies.lastIndexOf(","));
       // for middle one, we need to loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index "+ indexOfJava);

        int idxOfCss = technologies.indexOf("Css");
        System.out.println("Css is at index "+ idxOfCss);

        int indexOfCucumber = technologies.indexOf("Cucumber");
        System.out.println(technologies.indexOf("cucumber is at index "+ indexOfCucumber));

    }
}
