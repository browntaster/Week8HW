package Q3Inheritance;

public class SavingAccount extends BankAccount {
    public void withdraw() {
        System.out.println("Unsufficient amount to withdraw");
    }

    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.withdraw();
        savingAccount.deposit();
    }
}
