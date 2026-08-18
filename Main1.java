class BankAccount {

    // Fields
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        if(balance>0){this.balance=balance;}else{
            System.out.println("error");
            // break;
        }
    }

    // Get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Get account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Set account holder name
    public void setAccountHolderName(String accountHolderName) {
        if(accountHolderName==null || accountHolderName.isEmpty()){
            System.out.println("invalid");
        }else{
            this.accountHolderName=accountHolderName;
        }
        // Validate name
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if(amount>0){
            balance+=amount;
        }
        // Validate amount
        // Update balance
    }

    // Withdraw money
    public void withdraw(double amount) {

        // Validate amount
        // Check sufficient balance
        // Update balance
        if(balance>=amount){
            balance-=amount;
        }
    }

    // Display account details
    public void displayDetails() {
        System.out.println(accountNumber);
        System.out.println(accountHolderName);
        System.out.println(balance);
    }
}

public class Main1 {

    public static void main(String[] args) {

        // Create valid account
        BankAccount acc1=new BankAccount(1   ,   "raj ", 10000);
        // Display details
        acc1.displayDetails();
        // Deposit
        acc1.deposit(5000);
        acc1.displayDetails();
        // Withdraw
        acc1.withdraw(5000);
        acc1.displayDetails();
        // Change name



        // Try invalid name
        acc1.setAccountHolderName(null);

        // Try invalid deposit
        acc1.deposit(-200);

        // Try invalid withdrawal
        acc1.withdraw(50000);

        // Create account with negative initial balance
        BankAccount acc2=new BankAccount(2, "t", -1000);
    }
}