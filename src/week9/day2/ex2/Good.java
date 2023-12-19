package week9.day2.ex2;

public abstract class Good {
    private String name;
    private double price;

    public Good(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public abstract void showDescription();

    public Good(){}

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price >= 0)
            this.price = price;
    }
}
