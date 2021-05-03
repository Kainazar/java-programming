package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if(false == isHungry){
        System.out.println(" I am hungry I will go get something to eat ");
    } else {
            System.out.println(" i am not hungry, Lets keep coding Java");
        }
        double price =330.44;
        boolean isAffordable = price <=200.0;
        if ( isAffordable){
            System.out.println(" yes you could buy this items ");
        }else {
            System.out.println("you can't affodable this item lets' keep working in Java");
        }
        System.out.println(" welcome any time ");

        boolean isRemoteJob = true;
        // isRemoteJob!=true
        // !isRemoteJob,          this way better
        // isRemoteJob==false.
        if(!isRemoteJob){
            System.out.println(" Sorry i am not interested");
        }else {
            System.out.println(" Sure i am interested, what is the interview process? ");
        }

}
}