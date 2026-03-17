package BridgeLabz_Java.searching;

class SentenceSearch {

    static String findSentence(String[] sentences, String target) {

        // check each sentence one by one
        for (String sentence : sentences) {

            // simple contains check
            if (sentence.contains(target)) {
                return sentence; // return immediately once found
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
                "Java is powerful",
                "DSA is important",
                "Practice makes perfect"
        };

        String result = findSentence(sentences, "DSA");

        System.out.println(result);
    }
}