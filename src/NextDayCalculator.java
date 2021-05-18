import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class NextDayCalculator {

    public static int[] findNextDayCalculator(int day, int month, int year) {
        switch (month) {
            case 12:
                if (day == 31) {
                    int[] nextDay = {1, 1, year + 1};
                    return nextDay;
                } else {
                    int[] nextDay = {day + 1, month, year};
                    return nextDay;
                }

            case 2:
                if (year % 4 == 0 && day == 29) {
                    int[] nextDay = {1, month + 1, year};
                    return nextDay;
                } else if (year % 4 != 0 && day == 28) {
                    int[] nextDay = {1, month + 1, year};
                    return nextDay;
                } else {
                    int[] nextDay = {day + 1, month, year};
                    return nextDay;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    int[] nextDay = {1, month + 1, year};
                    return nextDay;
                } else {
                    int[] nextDay = {day + 1, month, year};
                    return nextDay;
                }
            default:
                if (day == 31) {
                    int[] nextDay = {1, month + 1, year};
                    return nextDay;
                } else {
                    int[] nextDay = {day + 1, month, year};
                    return nextDay;
                }
        }
    }
}