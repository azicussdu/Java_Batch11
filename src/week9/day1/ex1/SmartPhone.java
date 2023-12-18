package week9.day1.ex1;

import java.util.ArrayList;

public class SmartPhone {
    private int freeMemory; // in megabytes
    private ArrayList<App> appList = new ArrayList<>();

    public SmartPhone(int freeMemory){
        if(freeMemory >= 0)
            this.freeMemory = freeMemory;
    }
}
