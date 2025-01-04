package org.example.BankApplication;

public class NotEnoughBalance extends RuntimeException{

    public NotEnoughBalance(){
        super("Not enough balance in your account");
    }

}
