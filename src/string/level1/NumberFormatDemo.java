package string.level1;

import java.util.Scanner;

class NumberFormatDemo {

    static void generateException(String text) {
        Integer.parseInt(text);
    }

    static void handleException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generateException(text);
        handleException(text);
    }
}