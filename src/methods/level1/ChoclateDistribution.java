package methods.level1;

import java.util.Scanner;

public class ChoclateDistribution {
    public static int[] choclateDistribution(int numberOfChoclates, int numberOfstudents){
        return new int[]{numberOfChoclates/numberOfstudents, numberOfstudents%  numberOfChoclates};
   }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfChoclates = input.nextInt();
        int numberOfStudents = input.nextInt();
        int[] result = choclateDistribution(numberOfChoclates, numberOfStudents);
        System.out.println("Each child gets : " + result[0]);
        System.out.println("Remaining Chocolates : " + result[1]);
        input.close();
    }
}
