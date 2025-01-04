package org.example.BankApplication;

import java.time.LocalDate;

public class Account {

    private User accountHolder;
    private String account_number;
    private String IFSC;
    private String branchName;
    public volatile long balance=(long)0;

    public Account(User us,String number){

        this.accountHolder=us;
        this.account_number=number;
        this.balance=100;
        Bank.createBank().adduser(this);

    }

    public User getAccountHolder()
    {
        return accountHolder;
    }

    public void setAccountHolder(User accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getIFSC() {
        return IFSC;
    }

    public void setIFSC(String IFSC) {
        this.IFSC = IFSC;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountHolder=" + accountHolder +
                ", account_number='" + account_number + '\'' +
                ", IFSC='" + IFSC + '\'' +
                ", branchName='" + branchName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Account doTransaction(int amount){
        Transaction ts=new Transaction(amount);
        ts.setTransactionDate(LocalDate.now());
        ts.setAmount(amount);
        ts.setTransactionFrom(this.account_number);
        Bank.createBank().updateBalance(amount).addTransaction(ts,this.account_number);
        return this;



    }
}
