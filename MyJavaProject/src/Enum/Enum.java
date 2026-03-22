package Enum;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Enum {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of work week.");
                break;
            case FRIDAY:
                System.out.println("Last work day.");
                break;
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Regular day.");
        }
    }
}

