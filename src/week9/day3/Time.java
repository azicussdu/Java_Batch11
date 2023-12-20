package week9.day3;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void showIn12Format(){ // 22:30:45 -> should print 10:30:45 PM

    }

    public void showIn24Format(){ // 22:30:45 -> should print 22:30:45

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) { // check 0-23
        if(hour >= 0 && hour <= 23)
            this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) { //check 0-59
        if(minute >=0 && minute <= 59)
            this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) { // check 0-59
        if(second >= 0 && second <= 59)
            this.second = second;
    }

    public String toString(){
        return hour+":"+minute+":"+second;
    }
}
