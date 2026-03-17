package BridgeLabz_Java.searching;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadFileLineByLine {

    public static void main(String[] args) {

        String filePath = "sample.txt";

        // try-with-resources automatically closes file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // read until file ends
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}