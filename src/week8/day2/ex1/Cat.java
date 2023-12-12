package week8.day2.ex1;

public class Cat extends Animal{
    private boolean isLazy;

    public Cat(String color, boolean isLazy){
        super(color);
        this.isLazy = isLazy;
    }

    @Override
    public void makeSound() {
        System.out.println("Meaw meaw");
    }

    public void haveARest(){
        System.out.println("Ok, I will sleep");
    }

    public boolean isLazy() {
        return isLazy;
    }

    public void setLazy(boolean lazy) {
        isLazy = lazy;
    }
}
