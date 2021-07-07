package hiding;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Mobile mobile = new Mobile();



        phone.call();
        System.out.println("==================");
        mobile.call();

    }
}
