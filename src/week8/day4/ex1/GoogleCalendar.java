package week8.day4.ex1;

public class GoogleCalendar extends App{

    public GoogleCalendar(int sizeMb) {
        super("Google Calendar", sizeMb);
    }

    @Override
    public void launch() {
        System.out.println("Loading your reminders, wait...");
    }
}
