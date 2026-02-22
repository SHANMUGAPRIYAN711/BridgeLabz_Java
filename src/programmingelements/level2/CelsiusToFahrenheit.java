package programmingelements.level2;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(
                celsius + " celsius is " + fahrenheit + " fahrenheit"
        );
    }
}
