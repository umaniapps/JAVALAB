package exp_6;

import java.util.*;
class Customer
{
    String cust_id, cust_name,address;
    float balance;
    Scanner sc=new Scanner(System.in);
    public void get_CustomerInfo()
    {
        System.out.println("Enter Customer ID, Name, Balance and address");
        cust_id=sc.nextLine();
        cust_name=sc.nextLine();
        balance=sc.nextFloat();
        sc.nextLine();
        address=sc.nextLine();
    }
    public void show_CustomerInfo()
    {
        System.out.println("Customer Details are:");
        System.out.println("Id: "+cust_id);
        System.out.println("Name: "+cust_name);
        System.out.println("Balance: "+balance);
        System.out.println("Address: "+address);
    }
}
class Transaction extends Customer
{
    public void deposit(float amt)
    {
        System.out.println("Amount Deposited: "+amt);
        balance=balance+amt;
    }
    public void withdraw(float amt)
    {
        System.out.println("Amount withdrawn: "+amt);
        balance=balance-amt;
    }
    public void show_Bal()
    {
        System.out.println("Available Balance: "+balance);
    }
}
class Bank extends Transaction
{
    static String bankname="Canara Bank",ifsc="CBN0003268";
    public void show_BankInfo()
    {
        System.out.println("Bank Name: "+Bank.bankname);
        System.out.println("IFSC Code: "+Bank.ifsc);
    }
    public static void main(String args[])
    {
        Bank c1=new Bank();
        c1.get_CustomerInfo();
        c1.show_CustomerInfo();
        c1.show_BankInfo();
        c1.deposit(10000);
        c1.show_Bal();
        c1.withdraw(5000);
        c1.show_Bal();
    }
}
