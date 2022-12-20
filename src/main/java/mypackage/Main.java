package mypackage;

public class Main {
    public static void main(String[] args) {

        Week week2 = new Week(2);
        System.out.println(week2.getWeekNumber() + ":");

        Day day = new Day(3, DaysOfWeek.MONDAY);
        for (int i = 0; i < 7; i++) {
            System.out.println(day.getDayOfWeek() + " - " + day.getDay());
            day = day.getNextDay();
        }

        Week week3 = week2.getNextWeek();
        System.out.println();
        System.out.println(week3.getWeekNumber() + ":");

        for (int i = 0; i < 7; i++) {
            System.out.println(day.getDayOfWeek() + " - " + day.getDay());
            day = day.getNextDay();
        }

        Week week4 = week3.getNextWeek();
        System.out.println();
        System.out.println(week4.getWeekNumber() + ":");

        for (int i = 0; i < 7; i++) {
            System.out.println(day.getDayOfWeek() + " - " + day.getDay());
            day = day.getNextDay();
        }


    }

}