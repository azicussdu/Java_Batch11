package week7.day4.hometask;

public class Tiger extends Cat{
    private double speed;

    public Tiger(String color, boolean isWild, int age, double speed){
        super(color, isWild, age);
        setSpeed(speed);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar Roar");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if(speed >= 0)
            this.speed = speed;
        else
            this.speed = 1;
    }
}
