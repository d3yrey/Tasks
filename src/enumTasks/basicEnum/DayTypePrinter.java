package enumTasks.basicEnum;

public class DayTypePrinter {

    public static void printDayType(Day day) {
        if (day == null) {
            System.out.println("Day is null");
            return;
        }

        switch (day) {
            case SATURDAY, SUNDAY -> System.out.println(day + " is weekend");
            default -> System.out.println(day + " is weekday");
        }
    }

    public static void main(String[] args) {
        printDayType(Day.MONDAY);
        printDayType(Day.SATURDAY);
    }
}


