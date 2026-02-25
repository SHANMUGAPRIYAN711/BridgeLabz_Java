package methods.level2;

class DistanceConverter {

    // Convert kilometers to miles
    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    // Convert miles to kilometers
    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static void main(String[] args) {

        double km = 10;
        double miles = 5;

        System.out.println("Kilometers to Miles: " + kmToMiles(km));
        System.out.println("Miles to Kilometers: " + milesToKm(miles));
    }
}