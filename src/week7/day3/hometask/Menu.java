package week7.day3.hometask;

import java.util.ArrayList;

public class Menu {
    private String restaurantName;
    private ArrayList<Food> foodList = new ArrayList<>();

    public Menu(String restaurantName){
        setRestaurantName(restaurantName);
    }

    public Menu(String restaurantName, ArrayList<Food> foodList){
        setRestaurantName(restaurantName);
        setFoodList(foodList);
    }

    public String toString(){
        return "restaurant name: " + restaurantName + "\nfoods: " + foodList;
    }

    public void setFoodList(ArrayList<Food> foodList){
        this.foodList = foodList;
    }

    public ArrayList<Food> getFoodList(){
        return foodList;
    }

    public void setRestaurantName(String restaurantName){
        this.restaurantName = restaurantName;
    }

    public String getRestaurantName(){
        return restaurantName;
    }
}
