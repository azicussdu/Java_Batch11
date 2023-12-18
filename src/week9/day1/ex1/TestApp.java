package week9.day1.ex1;

public class TestApp {
    public static void main(String[] args) {

        SmartPhone mySmartPhone = new SmartPhone(2000);

        Youtube yt = new Youtube(800); // freeMemory = 1600
        Whatsapp wh = new Whatsapp(600); // freeMemory = 1300
        Telegram tg = new Telegram(500); // freeMemory = 800
        Snake sn = new Snake(500); // freeMemory = 300
        GoogleCalendar gc = new GoogleCalendar(400); // error

        mySmartPhone.install(yt);
        mySmartPhone.install(wh);
        mySmartPhone.install(tg);

        mySmartPhone.install(sn); // snake was not installed
        mySmartPhone.install(gc); // google was not installed

        mySmartPhone.uninstall("whatsapp");

        mySmartPhone.install(sn);
        mySmartPhone.install(gc); // can not install

        mySmartPhone.uninstall("telegram");
        mySmartPhone.install(gc); // finally now I can install

    }
}
