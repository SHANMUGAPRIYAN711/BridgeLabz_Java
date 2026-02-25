package methods.level2;

import java.util.Scanner;

class FriendsComparison {

    public static int findYoungest(int[] age) {
        int min = age[0];
        for (int a : age) if (a < min) min = a;
        return min;
    }

    public static int findTallest(int[] height) {
        int max = height[0];
        for (int h : height) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextInt();
        }

        System.out.println("Youngest Age: " + findYoungest(age));
        System.out.println("Tallest Height: " + findTallest(height));

        input.close();
    }
}