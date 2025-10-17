package sp25_bcs_134;

public class CinemaDemo{

    public static void main(String[] args){

        CityCinema originalKarachi = new CityCinema("Karachi", 2, 3);
        CityCinema lahore = new CityCinema("Lahore", 1, 2);
        CityCinema islamabad = new CityCinema("Islamabad", 2, 2);

        CityCinema copyKarachi = new CityCinema(originalKarachi);


        //Preliminary layouts of each city 
        System.out.println("--- Cinema Management System ---");
        System.out.println("Initial Layouts:");
        /*karachi.simpleDisplay();
        lahore.simpleDisplay();
        islamabad.simpleDisplay();*/

        copyKarachi.simpleDisplay();
        

        //Booking a seat using cinemaName, screenName and seatId
        System.out.println(">>> Booking seat 3-007 in Karachi, Cinema-1, Screen-1");
        System.out.println("Booking success? " + copyKarachi.book("Cinema-1", "Screen-1", "3-007"));

        //Trying to book the same seat using cinemaName, screenName and seatId
        System.out.println("\n>>> Trying to book the same seat again (failure is expected)");
        System.out.println("Second booking success? " + copyKarachi.book("Cinema-1", "Screen-1", "3-007"));

        //Cancelling a booked seat
        System.out.println("\n>>> Cancelling the booking");
        System.out.println("Cancellation success? " + copyKarachi.cancel("Cinema-1", "Screen-1", "3-007"));

        // updated layout after operations
        System.out.println("\nUpdated Layout for Karachi:");
        copyKarachi.simpleDisplay();

        //Displaying city-wide stats
        System.out.println("City Stats:");
        System.out.println(copyKarachi);

        //Searching for first available VIP seat
        System.out.println("\n>>> Finding first available VIP seat in Karachi:");
        String vipSeat = copyKarachi.findFirstAvailablePretty(Type.Vip);
        System.out.println(vipSeat != null ? vipSeat : "No VIP seat available.");

    }

    
}
