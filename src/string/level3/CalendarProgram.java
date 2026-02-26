package string.level3;
import java.util.Scanner;
public class CalendarProgram {
    // Method to check leap year
    static boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }

    // Method to find first day of the month
    static int firstDayOfMonth(int month, int year) {

        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;

        return (1 + x + (31 * m) / 12) % 7;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year))
            daysInMonth[1] = 29;

        int startDay = firstDayOfMonth(month, year);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < startDay; i++)
            System.out.print("    ");

        for (int day = 1; day <= daysInMonth[month - 1]; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0)
                System.out.println();
        }
    }
}
