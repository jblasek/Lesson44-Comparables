package com.company;

import java.util.Comparator;

public class Compare implements Comparator {

    public int compare(Object firstObj, Object secondObj) {
        BankAccount bankA1 = (BankAccount) firstObj;
        BankAccount bankA2 = (BankAccount) secondObj;
        int num;

        if (bankA1.balance < bankA2.balance) {
            num = -1;
        }
        else {
            if(bankA1.balance > bankA2.balance) {
                num = 1;
            }
            else {
                num = 0;
            }
        }
        return  num;
    }
}