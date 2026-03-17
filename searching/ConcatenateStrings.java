package BridgeLabz_Java.searching;

class ConcatenateStrings {

    static String concatenate(String[] arr) {

        // StringBuffer is thread-safe (as per requirement)
        StringBuffer sb = new StringBuffer();

        for (String str : arr) {
            sb.append(str); // better than using +
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String[] words = {"Hello", " ", "World", "!"};

        System.out.println(concatenate(words));
    }
}