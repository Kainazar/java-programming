package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 30;
        String reply = ( hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);


        String todayClass = "Java";
        String teacher = (todayClass.equals ("Java")) ? "Murodil" : "Nadir";
        System.out.println("teacher = " + teacher);


        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "Yes have DL can drive" : "No DL cannot drive";
        System.out.println("driving = " + driving);
    }

}
