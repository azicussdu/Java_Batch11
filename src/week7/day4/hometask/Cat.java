package week7.day4.hometask;

public class Cat extends Animal{
    private int age;

    public Cat(String color, boolean isWild, int age){
        super(color, isWild);
        setAge(age);
    }


    @Override
    public void makeSound() {
        System.out.println("Miew miew");
    }

    @Override
    public String toString() {
        return super.toString() + "\nage: " + age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0)
            this.age = age;
        else
            this.age = 1;
    }
}
