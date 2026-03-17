package BridgeLabz_Java.searching;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

class ByteToCharReader {

    public static void main(String[] args) {

        String filePath = "sample.txt";

        try (
                InputStreamReader isr = new InputStreamReader(
                        new FileInputStream(filePath), "UTF-8"
                );
                BufferedReader br = new BufferedReader(isr)
        ) {

            String line;

            // read decoded characters
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}