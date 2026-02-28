package extrabuiltinmethods;
import java.util.Scanner;

class TemperatureConverter {

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp = sc.nextDouble();

        System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(temp));
        System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(temp));
    }
}