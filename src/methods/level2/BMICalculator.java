package methods.level2;

import java.util.Scanner;

class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double h = data[i][1] / 100;
            data[i][2] = data[i][0] / (h * h);
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            status[i] = bmi < 18.5 ? "Underweight" :
                    bmi < 25 ? "Normal" :
                            bmi < 30 ? "Overweight" : "Obese";
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            data[i][0] = input.nextDouble(); // weight
            data[i][1] = input.nextDouble(); // height
        }

        calculateBMI(data);
        String[] status = getBMIStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2] + " " + status[i]);
        }

        input.close();
    }
}