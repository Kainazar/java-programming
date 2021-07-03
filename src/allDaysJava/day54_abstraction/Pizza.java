package allDaysJava.day54_abstraction;

public class Pizza extends MenuItem{
    @Override
    public void prepare(){
        System.out.println("chop veggies, add dressing");
    }
    public void serve(){
        System.out.println("Put in bowl and make dom");
    }

}
