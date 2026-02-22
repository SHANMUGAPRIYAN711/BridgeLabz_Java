package programmingelements.level1;

public class PenDistribution {
    public static void main(String[] args) {
        int pen = 14;
        int student = 3;

        int penPerStudent = pen / student;
        int reminingPens = pen % student;
        System.out.println("The pen per Studet is : " + " "+ penPerStudent + " " + "and the remaining pen not distributed is :"+ " "+ reminingPens);
    }
}
