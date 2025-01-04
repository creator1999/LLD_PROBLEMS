package org.example.BankApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class  Bank {
    public  static Bank bank;
    private static Long BankBalance=(long)0;

    private  static HashMap<String,Account> hs=new HashMap<>();
    private static List<Transaction> transactions=new ArrayList<>();

    public static Bank createBank(){
        if(bank==null){
            return new Bank();
        }
        return bank;
    }
    public static  Bank updateBalance(int amount){
        BankBalance=BankBalance-amount;
        return bank;
    }
    public static Bank addTransaction(Transaction ts,String AccountNum){
        try{
            updateIndividual(AccountNum,(int)ts.getAmount());
            transactions.add(ts);
            System.out.println(transactions.toString());

        }
        catch (NotEnoughBalance ex){
            System.out.println(ex.getMessage());
        }
        catch (IllegalAccessException e){
            e.getMessage();
        }
        return bank;


    }
    public static void adduser(Account acc){
        hs.put(acc.getAccount_number(),acc);
        System.out.println(hs.toString());
    }

    public static void updateIndividual(String AccountNumber,int amount) throws IllegalAccessException {
        int temp=(int)hs.get(AccountNumber).balance-amount;
        System.out.println(temp);
        if(temp<0){
            throw new NotEnoughBalance();
        }
        else{
           Account a=hs.get(AccountNumber);
           a.balance=(long)temp;

        }
    }





}
