package week7.day3.hometask;

public class Food {
    private String name;
    private int price;

    public Food(String name, int price){
        setName(name);
        setPrice(price);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(int price){
        if(price >= 0){
            this.price = price;
        }
        else{
            System.out.println("The price value should be positive number");
        }
    }

    public int getPrice(){
        return price;
    }

    public String toString(){
        return "name: " + name + ", price: " + price;
    }
}
