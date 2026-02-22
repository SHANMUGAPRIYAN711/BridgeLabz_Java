package programmingelements.level1;

public class AverageMarks {
    public static void main(String[] args) {
        String name = "Sam";
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int totalMarks = maths + physics + chemistry;
        double average = totalMarks / 3;
        System.out.println(name + "average marks in PCM is : " + average);
    }
}
