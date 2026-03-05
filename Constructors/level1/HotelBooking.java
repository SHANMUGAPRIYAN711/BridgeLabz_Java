package BridgeLabz_Java.Constructors.level1;
class HotelBooking {

    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    void displayBookingDetails() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }

    public static void main(String[] args) {

        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("John", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);

        b1.displayBookingDetails();
        b2.displayBookingDetails();
        b3.displayBookingDetails();
    }
}
