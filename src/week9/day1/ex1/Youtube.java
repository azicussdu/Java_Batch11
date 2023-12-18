package week9.day1.ex1;

public class Youtube extends App {

    public Youtube(int sizeMb) {
        super("youtube", sizeMb);
    }

    @Override
    public void launch() {
        System.out.println("Youtube is loading you account, please wait...");
    }
}
