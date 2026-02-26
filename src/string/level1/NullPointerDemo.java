package string.level1;

class NullPointerDemo {

    static void generateException() {
        String text = null;
        text.length(); // Exception occurs
    }

    static void handleException() {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        // generateException();  // Uncomment to see abrupt stop
        handleException();
    }
}
