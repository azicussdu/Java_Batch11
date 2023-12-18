package week9.day1.ex1;

public class Whatsapp extends App implements IMessenger {

    public Whatsapp(int sizeMb) {
        super("whatsapp", sizeMb);
    }

    @Override
    public void launch() {
        System.out.println("Loading your contacts from phone, wait...");
    }

    @Override
    public void sendMessage(String contact, String message) {
        System.out.println("sending from a " + getName() + " app...");
        System.out.println("To a phone number: " + contact + ", message: " + message);
    }
}
