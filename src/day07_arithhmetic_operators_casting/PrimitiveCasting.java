package day07_arithhmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        String firstName, lastName, companyApple,jobTitle,officeAddress;
        firstName = "Bakyt";
        lastName = "Kainazarov";
        companyApple = "GOOGLE";
        jobTitle = "SDET";
        officeAddress = "chicago IL.";

        int salary = 120000;
        byte startDay = 5;
        short StartYear = 2021;
        boolean fullTime = true;

        System.out.println("***APPLE NEW HIRE INFORMATION***");
        System.out.println(firstName + " Welcome to Apple.");
        System.out.println("Where did you work last time " + companyApple);
        System.out.println(" What kind the job did you do ?  " + jobTitle);
        System.out.println("Where is job Location? " + officeAddress);
        System.out.println("I am Looking Job for " + salary +" i can start the job with in " + startDay + " days "  );
        System.out.println("when you start looking the job " + StartYear + " do you wanna work full time, yes it is " + fullTime +".");
        System.out.println("You can call me at my " + firstName + " " + lastName + ".");









    }
}
