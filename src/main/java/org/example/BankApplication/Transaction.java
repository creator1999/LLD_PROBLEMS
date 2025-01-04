package org.example.BankApplication;

import java.time.LocalDate;

public class Transaction {
    private long amount;
    private TransactionType Ttype;
    private Account transaction;
    private String transactionFrom;
    private LocalDate TransactionDate;


    public Transaction(int Amount){
        this.amount=Amount;
    }
    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public TransactionType getTtype() {
        return Ttype;
    }

    public void setTtype(TransactionType ttype) {
        Ttype = ttype;
    }

    public LocalDate getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        TransactionDate = transactionDate;
    }

    public Account getTransaction() {
        return transaction;
    }

    public void setTransaction(Account transaction) {
        this.transaction = transaction;
    }

    public String getTransactionFrom() {
        return transactionFrom;
    }

    public void setTransactionFrom(String transactionFrom) {
        this.transactionFrom = transactionFrom;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", Ttype=" + Ttype +
                ", transaction=" + transaction +
                ", transactionFrom='" + transactionFrom + '\'' +
                ", TransactionDate=" + TransactionDate +
                '}';
    }
}
