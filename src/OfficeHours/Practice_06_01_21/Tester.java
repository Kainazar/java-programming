package OfficeHours.Practice_06_01_21;

public class Tester {

    private String name;
    private int id;
    private String jobTitle;
    private double salary;

public Tester (String name, int id, String jobTitle, double salary) {

    this.name= name;
    this.id= id;
    this.jobTitle= jobTitle;
    this.salary= salary;


   }
   public void smokeTesting() {
       System.out.println(this.name+ "is running a smoke test");


   }
   public void createTickets() {
       System.out.println(this.name+ " is creating a ticket ");
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
