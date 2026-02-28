package extrabuiltinmethods;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Enter first date (dd-MM-yyyy): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine(), formatter);

        System.out.print("Enter second date (dd-MM-yyyy): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine(), formatter);

        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE second date");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER second date");
        } else {
            System.out.println("Both dates are SAME");
        }
    }
}
