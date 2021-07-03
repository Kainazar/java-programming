package allDaysJava.day46_encapsulationToday;

public class CheckingAccount {
    private double balance;
    private int account;
    private String accountHolder;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getAccountHolder(String name) {
        return name;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                " balance = " + balance +
                ", account = " + account +
                ", accountHolder = '" + accountHolder + '\'' +
                '}';
    }
}

