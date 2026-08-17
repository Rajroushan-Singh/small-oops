import java.util.*;

class Customer {
    int cust_id;
    String name;

    Customer(int cust_id, String name) {
        this.cust_id = cust_id;
        this.name = name;
    }

    public void displaycustdetails() {
        System.out.print(cust_id);
        System.out.print(" " + name);
    }

}

class Bank {
    private int accountNumber;
    private String accountHolderName;
    private  double balance;
    // List<Customer> custList=new ArrayList<>();

    Bank(int accountNumber,String accountHolderName,double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double getbalance(){
        return balance;
    }

    // public void addcustomer(Customer cust) {
    //     custList.add(cust);
    // }

    // public void removecust(Customer cust) {
    //     custList.remove(cust);
    // }

    public void displaybankdetails() {
        System.out.println(accountNumber);
        System.out.println(accountHolderName);
        System.out.println(balance);
        // System.out.println(custList);
        // for(Customer customer:custList){
        //     customer.displaycustdetails();
        //     System.out.println();
        // }
    }
    public void withdraw(double amt){
        // double curr=getbalance();
        if(getbalance()>0 ){
            balance-=amt;
            System.out.println("withdraw");
        }else{
            System.out.println("invalid");
        }
    }
    public void deposit(double amt){
        // double curr= getbalance();
        if(amt>0 ){
            balance+=amt;
            System.out.println("withdraw");
        }else{
            System.out.println("invalid");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Customer cust1=new Customer(1, "raj");
        // Customer cust2=new Customer(2, "amit");
        // Customer cust3=new Customer(3, "vinit");
        // cust1.displaycustdetails();
        // System.out.println("-----------------------");
        // Bank b1=new Bank("bank1");
        // Bank b2=new Bank("bank2");
        // b1.displaybankdetails();
        // b1.addcustomer(cust3);
        // b1.displaybankdetails();
        // b1.removecust(cust3);
        // b1.displaybankdetails();
        Bank b1=new Bank(1234, "raj", 10000);
        b1.displaybankdetails();
        b1.getbalance();



    }
}