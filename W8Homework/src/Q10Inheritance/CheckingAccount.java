package Q10Inheritance;

public class CheckingAccount extends BankAccount {
    @Override
    public void withdraw(String name) {
        super.withdraw(name);
    }

    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount();
        c.withdraw("Amount Withdraw: $200000");
    }
}
