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
    String bankname;
    List<Customer> custList=new ArrayList<>();

    Bank(String bankname) {
        this.bankname = bankname;
        // this.custList = custList;
    }

    public void addcustomer(Customer cust) {
        custList.add(cust);
    }

    public void removecust(Customer cust) {
        custList.remove(cust);
    }

    public void displaybankdetails() {
        System.out.println(bankname);
        // System.out.println(custList);
        for(Customer customer:custList){
            customer.displaycustdetails();
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Customer cust1=new Customer(1, "raj");
        Customer cust2=new Customer(2, "amit");
        Customer cust3=new Customer(3, "vinit");
        cust1.displaycustdetails();
        System.out.println("-----------------------");
        Bank b1=new Bank("bank1");
        Bank b2=new Bank("bank2");
        b1.displaybankdetails();
        b1.addcustomer(cust3);
        b1.displaybankdetails();
        b1.removecust(cust3);
        b1.displaybankdetails();
    }
}