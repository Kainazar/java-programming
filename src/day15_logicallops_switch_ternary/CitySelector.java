package day15_logicallops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "MOSCOW";


        if (city.equals("MOSCOW ") || city.equals("Tampa")) {
            System.out.println(" Willing to relocate to MOSCOW");
        } else {
            System.out.println("Not considering - " + city);
        }
        String teacher = "Murodil";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("IT IS A JAVA CLASS WITH " + teacher);
        } else {
            System.out.println(" Soft skill class with Nadir " + teacher);
        }
        if (teacher.equals("Murodil") || teacher.equals("Saim")) {
            System.out.println("jAVA class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println(" Soft skill class with " + teacher);
        } else {
            System.out.println("Some class with " + teacher);
        }// company = "Google" salary >=100k;



        String company = " Google ";
        int salary = 100_000;
        if (company.equals( "Google ") || salary >=100_000){
            System.out.println(" I accept this offer" + company);
        } else {
            System.out.println("Rejecting offer from  "+ company);
        }
    }
}
