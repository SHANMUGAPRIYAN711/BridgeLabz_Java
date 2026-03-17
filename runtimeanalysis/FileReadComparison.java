package BridgeLabz_Java.runtimeanalysis;

import java.io.*;

class FileReadComparison {

    public static void main(String[] args) throws Exception {

        // Using FileReader (character stream)
        long start1 = System.nanoTime();

        FileReader fr = new FileReader("data.txt");
        while (fr.read() != -1) {
            // reading character by character
        }
        fr.close();

        long end1 = System.nanoTime();
        System.out.println("FileReader Time: " + (end1 - start1));

        // Using BufferedReader + InputStreamReader (faster)
        long start2 = System.nanoTime();

        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("data.txt"))
        );

        while (br.readLine() != null) {
            // reading line by line
        }
        br.close();

        long end2 = System.nanoTime();
        System.out.println("BufferedReader Time: " + (end2 - start2));
    }
}
