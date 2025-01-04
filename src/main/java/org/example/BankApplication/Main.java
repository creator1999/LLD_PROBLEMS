package org.example.BankApplication;

public class Main {
    public static void main(String[] args) {
        User us=new User();
        Account ac=new Account(us,"999999");
        User ravi=new User();
        Account ac1=new Account(ravi,"1111");

        ac.doTransaction(50);
        ac1.doTransaction(10);
        ac1.doTransaction(20);
        ac1.doTransaction(200);
    }
}