package controlflow.level2;

import java.util.Scanner;

public class StudentGradeCalculation {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        //Enter Physics Marks
        System.out.println("Enter Your Physics Marks : ");
        int physics = input.nextInt();
        //Enter Chemistry Marks
        System.out.println("Enter Your Chemistry Marks : ");
        int chemistry = input.nextInt();
        //Enter Math Marks
        System.out.println("Enter your math marks : ");
        int maths = input.nextInt();
        int sum = physics + chemistry + maths;
        double percentage = (double) sum / 3;
        //checks condition through which it passes
        if(percentage >= 80){
            System.out.println("Level 4 , above agency-normalized standards" + "Grade : A");
        } else if (percentage >=70){
            System.out.println("Level 3 , at agency-normalized standaerds" + "Grade : B");
        } else if (percentage >= 60){
            System.out.println("level 2, below, but approaching agency-normalized standards" + "Grade : C");
        } else if (percentage >= 50) {
            System.out.println("level 1, well below agency-normalized standards" + "Grade : D");
        }
        else if (percentage >= 40){
            System.out.println("Level 1, too below agency-normalized standards" + "Grade : E");
        }
        else{
            System.out.println("Remidal standards" + "Grade : R");
        }
    }
}
