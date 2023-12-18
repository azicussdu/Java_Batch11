package week9.day1.ex1;

import java.util.ArrayList;

public class SmartPhone {
    private int freeMemory; // in megabytes
    private ArrayList<App> appList = new ArrayList<>();

    public SmartPhone(int freeMemory){
        if(freeMemory >= 0)
            this.freeMemory = freeMemory;
    }

    public void install(App app){
        if(app.getSizeMb() <= freeMemory){
            appList.add(app);
            System.out.println("App: " + app.getName() + " is installed...");
            freeMemory = freeMemory - app.getSizeMb();
        }
        else{
            System.out.println("Sorry, no enough memory to install " + app.getName());
        }
    }

    public void uninstall(String appName){ // appName="whatsapp"
        for(App app : appList){
            if(app.getName().equalsIgnoreCase(appName)){
                appList.remove(app);
                freeMemory = freeMemory + app.getSizeMb();
                System.out.println("The app: " + app.getName() + " was removed");
                break;
            }
        }
    }
}
