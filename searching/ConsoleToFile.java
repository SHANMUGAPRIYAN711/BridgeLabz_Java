package BridgeLabz_Java.searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

class ConsoleToFile {

    public static void main(String[] args) {

        String filePath = "output.txt";

        try (
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(System.in)
                );
                FileWriter writer = new FileWriter(filePath)
        ) {

            System.out.println("Enter text (type 'exit' to stop):");

            String input;

            while (true) {

                input = reader.readLine();

                // stop condition
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // write each line to file
                writer.write(input + "\n");
            }

            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
