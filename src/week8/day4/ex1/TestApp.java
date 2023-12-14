package week8.day4.ex1;

import java.util.ArrayList;

public class TestApp {
    public static void main(String[] args) {

        ArrayList<App> appList = new ArrayList<>();

        appList.add(new Youtube(34));
        appList.add(new Whatsapp(25));
        appList.add(new GoogleCalendar(18));
        appList.add(new Telegram(42));
        appList.add(new Snake(22));

        for(App app : appList){
            app.launch();

            if(app instanceof IGame){ //snake and telegram
                ((IGame) app).showRequirement();
                ((IGame) app).play();
            }

            if(app instanceof IMessenger){ // will be true for Whatsapp and Telegram
//                ((IMessenger) app).sendMessage("+7323123123", "Hello friend");

                if(app instanceof Whatsapp){
                    ((Whatsapp) app).sendMessage("+7323123123", "Hello friend");
                    ((Whatsapp) app).receiveMessage();
                }
                else
                    if(app instanceof Telegram){
                        ((Telegram) app).sendMessage("hamza01", "Hello friend Hamza");
                        ((Telegram) app).receiveMessage();
                    }

            }

            app.close();
            System.out.println("-----------");
        }







//        add(12, 34);
    }

//    public static void add(int a, int b){
//        System.out.println(a+b);
//    }
}
