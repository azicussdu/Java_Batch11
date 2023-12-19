package week9.day2.ex2;

enum DeviceType {TV, SMARTPHONE, LAPTOP, SMARTWATCH}

public class ElectronicGood extends Good{

    /*
    Now ElectronicGood inherits fields: name and price
    also inherits methods: getName, setName, getPrice, setPrice and toString
    BUT ElectronicGood will not inherit a constructor
     */

    private DeviceType deviceType;

    public ElectronicGood(String name, double price, DeviceType deviceType){
        super(name, price);
        this.deviceType = deviceType;
    }

    @Override
    public void showDescription() {
        System.out.println("name: " + getName());
        System.out.println("price: " + getPrice());
        System.out.println("device type: " + deviceType);
    }

    @Override
    public String toString(){
        return super.toString() + ", device type is: " + deviceType;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }
}

