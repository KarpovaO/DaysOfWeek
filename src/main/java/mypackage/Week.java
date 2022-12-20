package mypackage;

public class Week {
    int weekNumber;

    public  Week(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public  int getWeekNumber () {
        return  weekNumber;
    }

    public  Week getNextWeek () {
        return  new Week(weekNumber + 1);
    }

}
