package sp25_bcs_134;

public class SeatDemo {

    public static void main(String[] args) {

        System.out.println("--- Cinema Management System ---");

        //Constructing seats of different types
        System.out.println("\n>>> Making few seats:");
        Seat regularSeat = new Seat(0, 1, Type.Regular);
        Seat vipSeat = new Seat(4, 7, Type.Vip);
        Seat reclinerSeat = new Seat(7, 9, Type.Recliner);

        System.out.println("New Regular Seat: " + regularSeat.toString());
        System.out.println("New VIP Seat: " + vipSeat.toString());
        System.out.println("New Recliner Seat: " + reclinerSeat.toString());

        //Demonstrating a booking
        System.out.println("\n>>> Demonstrating a booking:");
        System.out.println("Booking the VIP seat...");
        System.out.println("Booking successful? " + vipSeat.bookSeat());
        System.out.println("VIP Seat after booking: " + vipSeat.toString());

        //Attempting to book the same seat 
        System.out.println("\n>>> Attempting to book the same seat again:");
        System.out.println("Second booking successful? " + vipSeat.bookSeat());
        System.out.println("VIP Seat after failed attempt: " + vipSeat.toString());

        //Cancelling the booking
        System.out.println("\n>>> Cancelling the booking:");
        System.out.println("Cancellation successful? " + vipSeat.cancelBooking());
        System.out.println("VIP Seat after cancellation: " + vipSeat.toString());

        //Checking a seat that was never booked
        System.out.println("\n>>> Checking for a seat that was never booked:");
        System.out.println("Cancellation on an unbooked seat successful? " + regularSeat.cancelBooking());
        System.out.println("Regular Seat state: " + regularSeat.toString());
    }
}
