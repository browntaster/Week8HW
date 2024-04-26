package Q10Inheritance;

public class BankAccount {
    public void deposite(String name) {
        System.out.println(name);
    }
    public void withdraw(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposite("Deposit Amount: ");
        b.withdraw("Withdraw Amount: ");
    }
}
