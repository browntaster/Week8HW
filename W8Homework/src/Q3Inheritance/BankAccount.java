package Q3Inheritance;

public class BankAccount {
    public void deposit(){
        System.out.println("Money has been deposited");
    }

    public void withdraw(){
        System.out.println("Money has been withdraw");
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit();
        bankAccount.withdraw();
    }
}
