package week9.day2.ex2;

enum Color {WHITE, BLACK, RED, GREEN, PINK, BLUE}

public class ClothingGood extends Good{
    private Color color;

    public ClothingGood(String name, double price, Color color){
        super(name, price);
        this.color = color;
    }

    @Override
    public void showDescription() {
        System.out.println("name: " + getName());
        System.out.println("price: " + getPrice());
        System.out.println("color: " + color);
    }

    @Override
    public String toString(){
        return super.toString() + ", color is: " + color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
