package week6.day5.practice;

public class BankAccount {
    private int balance = 0;
    private int dailyLimit = 3000;

    public void deposit(int money){
        balance = balance + money;
    }

    public void withdraw(int money){
        if(balance >= money){
            if(dailyLimit - money >= 0){
                balance = balance - money;
                dailyLimit = dailyLimit - money;
            }
            else
                System.out.println("Your daily limit is over, so wait till tomorrow");
        }
        else
            System.out.println("no enough money to withdraw");
    }

    public int getBalance(){
        return balance;
    }
}
