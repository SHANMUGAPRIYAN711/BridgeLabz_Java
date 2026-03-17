package BridgeLabz_Java.searching;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class WordCountInFile {

    public static void main(String[] args) {

        String filePath = "sample.txt";
        String target = "java"; // word to search
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // split line into words
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (word.equals(target.toLowerCase())) {
                        count++;
                    }
                }
            }

            System.out.println("Occurrences of '" + target + "': " + count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}