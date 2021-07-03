package allDaysJava.day46_encapsulationToday;

public class AccountInfo {
    public static void main(String[] args) {
        CheckingAccount info = new CheckingAccount();
        info.setAccountHolder("Bakyt Kainazar");
        info.setBalance(1245);
        info.setAccount(123456789);
        System.out.println(info);
    }
}
