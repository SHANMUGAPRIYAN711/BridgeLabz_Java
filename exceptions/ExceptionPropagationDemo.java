package BridgeLabz_Java.exceptions;

public class ExceptionPropagationDemo {

    // This method generates an exception
    static void method1() {

        // This will cause ArithmeticException (divide by zero)
        int result = 10 / 0;
    }

    // This method calls method1()
    static void method2() {

        // No try-catch here → exception will propagate to caller
        method1();
    }

    // ---- MAIN METHOD ----
    public static void main(String[] args) {

        try {
            // Calling method2()
            method2();

        } catch (ArithmeticException e) {

            // Handling propagated exception
            System.out.println("Handled exception in main");
        }
    }
}
