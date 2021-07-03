package allDaysJava.day44_custom_classes;

public class Person {
    String name;
    int age;
    String jobTitle;
     public void firstName() {
         System.out.println(name +" is " + age+ " year old ");
     }public  void HowOld () {
        System.out.println(age);
    }public void running(){
        System.out.println(name+" is running "+ 10+ " km ");
    }public int burnCalory() {
        System.out.println(name+" is running 1 mile");
        return 10;
    } public int burnCaloryWithMile(int mileCount) {
        System.out.println(name+ " is running "+ mileCount+ " mile");
        return 10 * mileCount;
    } public  void Jobs (String jobTitle) {
        System.out.println(jobTitle);
    }
}
