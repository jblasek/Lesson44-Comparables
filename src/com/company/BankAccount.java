package com.company;

public class BankAccount implements Comparable {

    public String name;
    public double balance;

    public BankAccount(String n, double amount) {
        name = n;
        balance = amount;
    }

    public int compareTo(Object obj)
    {
        BankAccount temp = (BankAccount) obj;
        int num;
        if (balance < temp.balance) {
            num = -1;
        }
        else {
            if (balance > temp.balance) {
                num = 1;
            }
            else {
                num = 0;
            }
        }
        return num;

        /*
        BankAccount temp = (BankAccount) obj;
        int num;
        if (name.charAt(0) < temp.name.charAt(0)) {
            num = -1;
        } else {
            if (name.charAt(0) > temp.name.charAt(0)) {
                num = 1;
            } else {
                num = 0;
            }
        }
        return num;
        */




    }

    public void deposit(double dep) {
        balance = balance + dep;
    }

    public void withdraw(double with) {
        balance = balance - with;
    }

}