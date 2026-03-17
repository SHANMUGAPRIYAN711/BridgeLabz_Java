package BridgeLabz_Java.searching;

class ReverseString {

    static String reverse(String input) {

        // using StringBuilder because it's easy and efficient
        StringBuilder sb = new StringBuilder(input);

        // built-in reverse does the job
        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "hello";

        System.out.println("Reversed: " + reverse(str));
    }
}
