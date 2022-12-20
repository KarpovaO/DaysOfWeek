package mypackage;

import static mypackage.DaysOfWeek.*;

public class  Day {
    int day;
    String dayOfWeek;

    public Day(int day, String dayOfWeek) {
        this.day = day;
        this.dayOfWeek = dayOfWeek;

    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public String getDayOfWeek() {
        this.dayOfWeek = dayOfWeek;
        return dayOfWeek;

    }


    public static String getNexDayWeek(String dayOfWeek) {
        String nextDayOfWeek = MONDAY;
        if (dayOfWeek == MONDAY) {
            nextDayOfWeek = TUESDAY;
        } else if (dayOfWeek == TUESDAY) {
            nextDayOfWeek = WEDNESDAY;
        } else if (dayOfWeek == WEDNESDAY) {
            nextDayOfWeek = THURSDAY;
        } else if (dayOfWeek == THURSDAY) {
            nextDayOfWeek = FRIDAY;
        } else if (dayOfWeek == FRIDAY) {
            nextDayOfWeek = SATURDAY;
        } else if (dayOfWeek == SATURDAY) {
            nextDayOfWeek = SUNDAY;
        }
        return nextDayOfWeek;
    }

    public Day getNextDay() {
        int nextDay = day + 1;
        String nextDayOfWeek = getNexDayWeek(dayOfWeek);
        return new Day(nextDay, nextDayOfWeek);
    }


}

