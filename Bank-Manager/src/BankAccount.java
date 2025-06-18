public class BankAccount {
    int accountNo;
    String accountHolder;
    double balance;

    BankAccount(int accountNo , String accountHolder , double balance) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;

    }
    void display() {
        System.out.println("Account No. : " + this.accountNo);
        System.out.println("Account Holder : " + this.accountHolder);
        System.out.println("Account balance : " + this.balance);
    }

}
