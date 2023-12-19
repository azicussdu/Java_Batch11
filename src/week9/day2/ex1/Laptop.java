package week9.day2.ex1;

/*
to use with classes we have 2 access modifiers: public and default

to use with fields and methods we have 4 access modifiers: public, private, default, protected
1) public: we can access to this field or method directly from anywhere inside the project
2) default(package-private): we can access to this field or method only from same package
3) private: we can access to this field or call method only from the same class
4) protected: can access from same class, same package + child class also have access
   (even if child classes are in different package)

 */

public class Laptop {
    private String brand; // not private or public, brand is default (package-private)
    private int madeYear;

    public String toString(){
        return "brand: " + brand + ", made year is: " + madeYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMadeYear() {
        return madeYear;
    }

    public void setMadeYear(int madeYear) {
        if(madeYear >= 0)
            this.madeYear = madeYear;
    }

    /*
    If you do not provide your class with a constructor
    then java creates an invisible default constructor for you.
    So now, in this class you have this constructor:

    public Laptop(){

    }
     */

    public Laptop(String brand, int madeYear){
        this.brand = brand;
        this.madeYear = madeYear;
    }

    public Laptop(String brand){
        this.brand = brand;
    }

    public Laptop(){
        madeYear = 1970; // sometimes you can assign default values for your fields
    }

    // after you create a constructor, then java removes a default constructor
}
