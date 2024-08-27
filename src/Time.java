public class Time {
    int hour;
    int minute;
    int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    Time setHour(int h) {
        hour = (( h >= 0 && h < 24 ) ? h : 0 );
        return this;
    }

    Time setMinute(int m) {
        minute = (( m >= 0 && m < 60 ) ? m : 0 );
        return this;
    }
    Time setSecond(int s) {
        second = ((s >= 0 && s < 24 ) ? s : 0 );
        return this;
    }

    int getHour() { return hour; }
    int getMinute() { return minute; }
    int getSecond() { return second; }

    public String toString() {
        return ("" + (( hour == 12 || hour == 0 ) ? 12 : hour % 12)) +
                ":" + (minute < 10 ? "0" : "") + minute +
                ":" + (second < 10 ? "0" : "") + second +
                (hour < 12 ? " AM" : " PM") ;
    }
}
