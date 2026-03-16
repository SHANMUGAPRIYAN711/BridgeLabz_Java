package BridgeLabz_Java.stackqueuehashing;

import java.util.*;

public class CircularTourProblem {

    // function to find starting pump
    public static int findStart(int[] petrol, int[] distance) {

        int n = petrol.length;

        int start = 0;
        int balance = 0;
        int deficit = 0;

        for (int i = 0; i < n; i++) {

            balance += petrol[i] - distance[i];

            // if petrol becomes negative
            if (balance < 0) {

                // this start point cannot work
                start = i + 1;

                deficit += balance;

                balance = 0;
            }
        }

        // check if tour possible
        if (balance + deficit >= 0) {
            return start;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int result = findStart(petrol, distance);

        if (result == -1) {
            System.out.println("No possible tour");
        } else {
            System.out.println("Start from petrol pump index: " + result);
        }
    }
}
