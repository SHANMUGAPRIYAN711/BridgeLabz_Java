package methods.level1;

import java.util.Scanner;

public class SimpleInterest {
    static double simpleInterset(double principle, double rate, double time) {
        return (principle*rate*time)/100;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principle = input.nextInt();
        double rate = input.nextInt();
        double time = input.nextInt();
        double si = simpleInterset(principle, rate, time);
        System.out.println("The simple interest is " + si +"for principle" + principle +"Rate of interest" + rate + "and time" + time);
        input.close();
    }
}
