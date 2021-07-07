package day51_inheritance;

public class EmployeeObjects {



    public static void main(String[] args) {

        Employee wk1 = new Employee ();
        wk1.jobTitle="SDET";

        double annualDevSalary = wk1.calculateSalary(60.0);
        System.out.println("Annual Salary  = " + Math.round(annualDevSalary));
   //   System.out.println("wk1.calculateSalary(55.0) = " + wk1.calculateSalary(55.0));
        System.out.println("Developer Salary = " + Math.round(wk1.calculateSalary(55.0)));

        Contractor sdetContractor  = new Contractor();
        sdetContractor.jobTitle ="SDET";
        System.out.println("SDET Contractor Salary = " + Math.round(sdetContractor.calculateSalary(45.0)));


        System.out.println(wk1);
        System.out.println(sdetContractor);
    }
}
