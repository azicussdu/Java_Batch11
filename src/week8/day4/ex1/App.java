package week8.day4.ex1;

public abstract class App {
    private String name;
    private int sizeMb;

    public App(String name, int sizeMb) {
        setName(name);
        setSizeMb(sizeMb);
    }

    // assume that launch() is different for Child classes
    public abstract void launch();

    // the same algorithm for all Child classes
    public void close(){
        System.out.println("Closing a " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeMb() {
        return sizeMb;
    }

    public void setSizeMb(int sizeMb) {
        if(sizeMb > 0)
            this.sizeMb = sizeMb;
    }
}
