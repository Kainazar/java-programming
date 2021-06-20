package day54_abstraction;

public class CampusStudent extends Students {
    @Override
    public void attendClass() {
        System.out.println("Campus students is attending the class in person");
    }
}
