import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        BankAccount[] accounts = { new BankAccount(845445,"rahul",80000),
                new BankAccount(987471,"rohit",97000000),
                new BankAccount(987425,"virat",900000),
                new BankAccount(964751,"Hardik",680000),
                new BankAccount(147558,"jadeja",9800000)
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Account no you want to deposit money : ");
        int rAccount = scanner.nextInt();

        System.out.print("Enter the Amount You want to Deposit : ");
        double amount = scanner.nextDouble();

        boolean isFound = false;
        for (int i = 0 ; i < accounts.length ; i++) {
            if (accounts[i].accountNo == rAccount) {
                isFound = true;
                accounts[i].balance += amount;
                System.out.println("Update Balance : "+ accounts[i].balance );
                break;
            }
        }
        if (!isFound) {
            System.out.println("Account no does not exist");

        }

        BankAccount highBal = accounts[0];
        for (int i = 0 ; i < accounts.length ; i++) {
            if (accounts[i].balance > highBal.balance){
                highBal = accounts[i];
            }
        }
        System.out.println("The account Has highest balance is : " );
        highBal.display();


        scanner.close();
    }
}