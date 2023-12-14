package week8.day4.ex1;

public class Snake extends App implements IGame{
    public Snake(int sizeMb) {
        super("snake game", sizeMb);
    }

    @Override
    public void launch() {
        System.out.println("Launching Snake, it takes a few seconds...");
    }

    @Override
    public void play() {
        System.out.println("Ohh, see, snake is running, control it...");
    }

    @Override
    public void showRequirement() {
        System.out.println("Need 1gb ram, 1.1 Ghz of CPU");
    }
}
