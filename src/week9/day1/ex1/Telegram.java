package week9.day1.ex1;

// let us assume that in telegram app we also can play a game
// class can extend only 1 class, but can implement multiple interfaces
public class Telegram extends App implements IMessenger, IGame {

    public Telegram(int sizeMb){
        super("telegram", sizeMb);
    }

    @Override
    public void sendMessage(String account, String message) {
        System.out.println("sending from a " + getName() + " app...");
        System.out.println("To an account: " + account + ", message: " + message);
    }

    @Override
    public void launch() {
        System.out.println("Launching a telegram app, now you see a logo");
    }

    @Override
    public void play() {
        System.out.println("playing 2048 in telegram app...");
    }

    @Override
    public void showRequirement() {
        System.out.println("2 gb ram, 2.1 Ghz CPU");
    }
}
