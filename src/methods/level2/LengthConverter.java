package methods.level2;

class LengthConverter {

    // Convert meters to feet
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Convert feet to meters
    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {

        double meters = 10;
        double feet = 30;

        System.out.println("Meters to Feet: " + metersToFeet(meters));
        System.out.println("Feet to Meters: " + feetToMeters(feet));
    }
}