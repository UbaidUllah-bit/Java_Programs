public class ScreenDemo {
    public static void main(String[] args) {

        // --- Initialize city data (Pakistan cities) ---
        // Using the CityCinema constructor to create cities with pre-populated cinemas and screens
        CityCinema karachi = new CityCinema("Karachi", 2, 3);
        CityCinema lahore = new CityCinema("Lahore", 1, 2);
        CityCinema islamabad = new CityCinema("Islamabad", 2, 2);

        // --- Display initial layouts for each city ---

        
        System.out.println("--- Cinema Management System ---");
        System.out.println("Initial Layouts:");
        karachi.simpleDisplay();
        lahore.simpleDisplay();
        islamabad.simpleDisplay();

        // --- Demo booking and cancellation workflow ---
        System.out.println(">>> Booking seat 3-007 in Karachi, Cinema-1, Screen-1");
        boolean booked = karachi.book("Cinema-1", "Screen-1", "3-007");
        System.out.println("Booking success? " + booked);

        System.out.println("\n>>> Trying to book the same seat again (expected failure)");
        boolean bookedAgain = karachi.book("Cinema-1", "Screen-1", "3-007");
        System.out.println("Second booking success? " + bookedAgain);

        System.out.println("\n>>> Canceling the booking");
        boolean cancelled = karachi.cancel("Cinema-1", "Screen-1", "3-007");
        System.out.println("Cancellation success? " + cancelled);

        // --- Show updated layout after operations ---
        System.out.println("\nUpdated Layout for Karachi:");
        karachi.simpleDisplay();

        // --- Display city-wide stats ---
        System.out.println("City Stats:");
        System.out.println(karachi);
        System.out.println(lahore);
        System.out.println(islamabad);

        // --- Search for first available VIP seat ---
        System.out.println("\n>>> Finding first available VIP seat in Karachi:");
        String vipSeat = karachi.findFirstAvailablePretty(Type.Vip);
        System.out.println(vipSeat != null ? vipSeat : "No VIP seat available.");
    }
}
