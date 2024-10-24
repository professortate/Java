import java.util.Scanner;
class Account{
    int accNum;
    String accName;
    int phoneNum;
    float AccBalance;

    public void createAccount(int accNum, String accName,int phoneNum, float AccBalance){
        this.accNum = accNum;
        this.accName=accName;
        this.phoneNum=phoneNum;
        this.AccBalance=AccBalance;


    }
    public void deposit(float Balance){
        AccBalance +=Balance;
        System.out.println("Deposited Successfully");

    }

    public void withdraw(float Balance){
        AccBalance -= Balance;
        System.out.println("Withdrawn successfully");
    }

    public void display(){
        System.out.println("Account Details\n:");
        System.out.println("Account Id:\n" +accNum);
        System.out.println("Account Name:\n" +accName);
        System.out.println("Account Phone Number:\n" +phoneNum);
        System.out.println("Account Balance:\n" +AccBalance);



    }


}

public class account{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Account account1 =new Account();

        System.out.println("Enter account details:");
        System.out.print("Account Number: ");
        int accNum = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Name: ");
        String accName = scanner.nextLine();
        System.out.print("Phone Number: ");
        int phoneNum = scanner.nextInt();
        System.out.print("Balance Amount: ");
        float AccBalance = scanner.nextFloat();

        account1.createAccount(accNum, accName, accNum, AccBalance);
        
        // Deposit
        System.out.print("\nEnter amount to deposit: ");
        float Balance = scanner.nextFloat();
        account1.deposit(Balance);

        // Withdraw
        System.out.print("\nEnter amount to withdraw: ");
        float balance = scanner.nextFloat();
        account1.withdraw(balance);

        // Print account details
        account1.display();

        scanner.close();

    }
}
