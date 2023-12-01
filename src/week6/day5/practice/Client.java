package week6.day5.practice;

public class Client {
    int clientNo;
    String name;
    BankAccount ba = new BankAccount();

    public Client(String name, int clientNo){
        this.name = name;
        this.clientNo = clientNo;
    }

    public String toString(){
        return "name: " + name +
                "\nclient number: " + clientNo +
                "\nbalance: " + ba.getBalance();
    }
}
