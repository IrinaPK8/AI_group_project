public class Clock {
    // instance variables
    private int hours;
    private int minutes;
    private int seconds;

    public void setHours(int newHours) {
        hours = newHours;
        if (hours < 0 || hours > 24) {
            hours = 0;
        }
    }

    public void setMinutes(int newMinutes) {
        minutes = newMinutes;
        if (minutes < 0 || minutes > 60) {
            minutes = 0;
        }
    }

    public void setSeconds(int newSeconds) {
        seconds = newSeconds;
        if (seconds < 0 || seconds > 60) {
            seconds = 0;
        }
    }
}