package week9.day1.ex1;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void playAGame(){
        System.out.println("Choose a name to play:");
        for(App app : appList){
            if(app instanceof IGame){
                System.out.println(app.getName());
            }
        }

        Scanner scan = new Scanner(System.in);
        String appName = scan.nextLine();

        for(App app : appList){
            if(app instanceof IGame && app.getName().equalsIgnoreCase(appName)){
                ((IGame)app).play();
                break;
            }
        }
    }
}
