public class SeatDemo{

	public static void main(String[] args){

		Seat seat = new Seat(1, 35, Type.Regular);
		System.out.println(seat);
		System.out.println(seat.bookSeat());
		System.out.println(seat.cancelBooking());
		System.out.println(seat.getAvailability());
		


	}


}
