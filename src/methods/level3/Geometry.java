package methods.level3;

class Geometry {

    static double distance(double x1,double y1,double x2,double y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    static double[] line(double x1,double y1,double x2,double y2) {
        double m = (y2-y1)/(x2-x1);
        double c = y1 - m*x1;
        return new double[]{m, c};
    }

    public static void main(String[] args) {
        double[] l = line(1,2,3,6);
        System.out.println("Slope: " + l[0] + ", Intercept: " + l[1]);
    }
}
