package programmingelements.level1;

public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pie = 3.14159;
        double volumeKm = (4.0/ 3) * pie * radiusKm * radiusKm * radiusKm;
        double volumeMiles = volumeKm / (1.6 * 1.6 * 1.6);
        System.out.println("The volume of earth in cubic kilometer is " + " "+ volumeKm + " "+ "and cubic miles is" +" "+ volumeMiles);
    }
}
