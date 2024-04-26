package Q10Inheritance;

public class SavingAccount extends BankAccount {
    @Override
    public void withdraw(String name) {
        super.withdraw(name);
    }

    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.withdraw("Amount Withdraw: $10000");
    }
}
