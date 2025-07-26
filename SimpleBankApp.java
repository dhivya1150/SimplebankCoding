import java.util.Scanner;

class BankAccount{

    private String accountHolderName;
    private String accountNumber;
    private double balance;

public BankAccount( String name, String accNumber, double initialBalance)
{
    this.accountHolderName = name;
    this.accountNumber = accNumber;
    this.balance = initialBalance;

}

public void checkBalance()
{
    System.out.println("Current Balance : $" + balance);
}
public void deposit(double amount)
{
    if (amount>0)
    {
        balance += amount;
        System.out.println("$" + amount + "Deposited Successfully.");
    }
    else
    {
        System.out.println("Invalid Deposit Amount.");
    }
}
public void withdraw (double amount)
{
    if(amount>0 && amount<=balance)
    {
        balance -= amount;
        System.out.println("$" + amount + "Withdraw Successfully."); 
    }
    else
    {
        System.out.println("Invalid or Insufficent Balance");
    }
}
public void displayAccountInfo()
{
    System.out.println("\n --- Account Information ---");
    System.out.println("Account Holder: " + accountHolderName);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Balance: $" + balance);
}
}

public class SimpleBankApp {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Welcome to Simple Bank");
        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();

        System.out.println("Enter Account Number:");
        String accNumber = sc.nextLine();

        System.out.println("Enter Initial Balance: $");
        double initialBalance = sc.nextDouble();
    
    
BankAccount account = new BankAccount(name, accNumber, initialBalance);

    int choice;

    do
    {
        System.out.println("\n --- Menu ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Display Account Info");
        System.out.println("5. Exit");
        System.out.println("Enter Your Choice");
        choice = sc.nextInt();

   switch (choice) 
    {
        case 1:
             account.checkBalance();
             break;

        case 2: {
            System.out.println("Enter amount to deposit: $");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);
            break;}

        case 3:{
             System.out.println("Enter the Amount to Withdraw : $");
             double withdrawAmount = sc.nextDouble();
             account.withdraw(withdrawAmount);
             break;}

        case 4:
             account.displayAccountInfo();
             break;

        case 5:
             System.out.println("Thank You For Using Simpl Bank. GoodBye!!!");
             break;

        default:
              System.out.println("Invalid Choice ! Try Again.");
    }
        } while (choice != 5);
          
        sc.close();
    
}
}