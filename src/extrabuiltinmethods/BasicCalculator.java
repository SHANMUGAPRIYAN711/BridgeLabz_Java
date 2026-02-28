package extrabuiltinmethods;
import java.util.Scanner;

class BasicCalculator {

    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println(add(a, b)); break;
            case '-': System.out.println(subtract(a, b)); break;
            case '*': System.out.println(multiply(a, b)); break;
            case '/': System.out.println(divide(a, b)); break;
            default: System.out.println("Invalid Operator");
        }
    }
}
