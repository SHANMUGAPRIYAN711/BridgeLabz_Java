package string.level3;

// Question: Calculate BMI using String input

import java.util.Scanner;

class BMICalculation {

    // Method to calculate BMI
    static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Method to find BMI status
    static String bmiStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input as String
        String weightStr = sc.next();
        String heightStr = sc.next();

        // Convert String to double
        double weight = Double.parseDouble(weightStr);
        double height = Double.parseDouble(heightStr);

        double bmi = calculateBMI(weight, height);

        System.out.println("BMI Value: " + bmi);
        System.out.println("BMI Status: " + bmiStatus(bmi));
    }
}