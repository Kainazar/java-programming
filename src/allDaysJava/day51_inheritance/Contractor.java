package allDaysJava.day51_inheritance;

  public class Contractor extends  Employee {

      @Override
      public String toString() {
          return "Contractor{" +
                  "jobTitle='" + jobTitle + '\'' +
                  '}';
      }

      @Override

    public double calculateSalary (double hourlyRate) {

        return 52 * 40 * hourlyRate;


    }


}
