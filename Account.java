//package com.company;

/**
 * Created by Tamanna on 9/16/2015.
 */
public class Account {

    private Customer customer;
    private int accountNumber;
    private double balance;
    private String branch;

    public Account() {}

    public Account(Customer customer,int accountNumber,double balance)
    {
        this.customer= customer;
        this.accountNumber= accountNumber;
        this.balance= balance;
    }

    public Account(Customer customer,int accountNumber,String branch)
    {
        this.customer= customer;
        this.accountNumber= accountNumber;
        this.branch= branch;
    }


    public void setBranch(String branch)
    {
        this.branch= branch;
    }


    public void setBalance(double balance)
    {
        this.balance= balance;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public String getCustomerName()
    {
        return customer.getName() ;
    }

    public String getBranch()
    {
        return branch;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }


    public double getBalance()
    {
        return balance;
    }

    public void credit (double tk)
    {
        balance+=tk;
    }


    public void debit (double tk)
    {
        if(balance<tk)  System.out.println("You dont have enough balance");
        else balance-=tk;

    }


    public void print ()
    {
        System.out.println("Customer: " +customer.getName() + " Branch: " + getBranch() + " A/C no: "+ getAccountNumber() + " Balance: " +getBalance());
    }

}




