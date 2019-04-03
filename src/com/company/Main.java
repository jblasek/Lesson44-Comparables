package com.company;

import java.util.*;
import java.text.*;
public class Main {

    public static void main(String[] args) {
        NumberFormat numFor = NumberFormat.getNumberInstance();
        numFor.setMinimumFractionDigits(2);
        numFor.setMaximumFractionDigits(2);
        String name;
        ArrayList aryLst = new ArrayList();
        ArrayList <BankAccount> myAry = new ArrayList();
        ListIterator it = aryLst.listIterator();

        do {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to leave) ");
            name = kbReader.nextLine();
            if (!name.equalsIgnoreCase("EXIT")) {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble();
                System.out.println(" ");

                BankAccount theAccount = new BankAccount(name, amount);
                it.add(theAccount);
                myAry.add(theAccount);
            }
        }
        while (!name.equalsIgnoreCase("EXIT"));
        BankAccount ba = (BankAccount) it.previous();
        double mBalance = ba.balance;
        String mName = ba.name;

        while (it.hasPrevious()) {
            ba = (BankAccount) it.previous();
            if (ba.balance > mBalance) {

                mBalance = ba.balance;
                mName = ba.name;
            }
        }
        System.out.println(" ");
        System.out.println("The account with the largest balance belongs to " + mName + ".");
        System.out.println("The amount is $" + numFor.format(mBalance) + ".");

        // comparator

        BankAccount[] myLst =  new BankAccount[myAry.size()];
        myLst = myAry.toArray(myLst);
        Comparator comp = new Compare();
        Arrays.sort(myLst, comp);
        for(BankAccount b : myLst)
        {
            System.out.println("\n" + b.name + " --> " + b.balance);
        }

        //comparable
        /*
        Collections.sort(myAry);
        for(BankAccount b : myAry)
        {
            System.out.println("\n" + b.name + " >>> " + b.balance);
        }
        */

    }
}