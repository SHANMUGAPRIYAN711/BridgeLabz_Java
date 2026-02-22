package programmingelements.level2;

import java.util.Scanner;

public class ChoclateDistribution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.println(
                "Each child gets " + chocolatesPerChild +
                        " chocolates and remaining chocolates are " + remainingChocolates
        );
    }
}
