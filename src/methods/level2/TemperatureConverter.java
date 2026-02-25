package methods.level2;

class TemperatureConverter {

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        double celsius = 25;
        double fahrenheit = 77;

        System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
        System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
    }
}