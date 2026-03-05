package BridgeLabz_Java.Constructors.level1;
class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;

    static double pricePerDay = 1500;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * pricePerDay;
    }

    void displayRentalDetails() {

        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : " + calculateTotalCost());
    }

    public static void main(String[] args) {

        CarRental rental = new CarRental("Shanmugapriyan", "Toyota", 4);
        rental.displayRentalDetails();
    }
}