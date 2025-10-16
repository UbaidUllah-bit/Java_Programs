package sp25_bcs_134;

public class CityCinema {

    private Cinema[] cinemas;
    private final String cityName;
    private int cinemaCount;

    public CityCinema(String cityName) {

        this.cityName = cityName;
        this.cinemaCount = 0;
        this.cinemas = new Cinema[2];

    }

    public CityCinema(String cityName, int numCinemas, int screensPerCinema) {

        this(cityName);

        if (numCinemas <= 0 || screensPerCinema <= 0) {

            System.out.println("numCinemas and screensPerCinema must be positive.");
            return;

        }

        ensureCapacity(numCinemas);

        for (int i = 1; i <= numCinemas; i++) {

            cinemas[cinemaCount++] = new Cinema("Cinema-" + i, screensPerCinema);

        }

    }

    public String getCityName() {

        return cityName;

    }

    public int getCinemaCount() {

        return cinemaCount;

    }

    public boolean book(String cinemaName, String screenName, String seatId) {

		Cinema c = requireCinema(cinemaName);
		return c.book(screenName, seatId);

	}

	public boolean cancel(String cinemaName, String screenName, String seatId) {

		Cinema c = requireCinema(cinemaName);
		return c.cancel(screenName, seatId);

	}

    private Cinema requireCinema(String name) {

		Cinema c = findCinemaByName(name);

		return c;
	}

    public String findFirstAvailablePretty(Type type) {
        for (int i = 0; i < cinemaCount; i++) {

        Cinema c = cinemas[i];
        int screenCount = c.getScreenCount();
        for (int sIdx = 0; sIdx < screenCount; sIdx++) {
            Screen s = c.getScreen(sIdx);
            Seat seat = s.findFirstAvailable(type);
            if (seat != null) {
                return String.format("%s > %s > Seat %s (%s, %d)",c.getCinemaName(), s.getScreenName(), seat.getId(), seat.getSeatType(), seat.getPrice());
                }
            }
        }
    return null;
    }

    public Cinema[] getCinemas() {

        Cinema[] copy = new Cinema[cinemaCount];

        for (int i = 0; i < cinemaCount; i++) {

            copy[i] = cinemas[i];

        }

        return copy;
    }
    
    // The rest of the methods from the fragment below
    public void addCinema(Cinema cinema) {

        if (cinema == null) {

            System.out.println("cinema must not be null");

            return;
        }

        if (findCinemaByName(cinema.getCinemaName()) != null) {

            System.out.println("Cinema '" + cinema.getCinemaName() + "' already exists in " + cityName);

            return;
        }

        ensureCapacity(cinemaCount + 1);
        cinemas[cinemaCount++] = cinema;

    }

    public Cinema addCinema(String cinemaName, int screens) {

        Cinema c = new Cinema(cinemaName, screens);

        addCinema(c);

        return c;
    }
    
    public Cinema findCinemaByName(String cinemaName) {

        for (int i = 0; i < cinemaCount; i++) {

            if (cinemas[i].getCinemaName().equalsIgnoreCase(cinemaName)) {

                return cinemas[i];
            }
        }

        return null;
    }

    public int getTotalSeatCount() {
        int total = 0;

        for (int i = 0; i < cinemaCount; i++) {

            total += cinemas[i].getTotalSeatCount();

        }

        return total;
    }

    public int getAvailableSeatCount() {

        int total = 0;

        for (int i = 0; i < cinemaCount; i++) {

            total += cinemas[i].getAvailableSeatCount();
        }

        return total;
    }
    
    // Renamed to match your existing Type enum
    public int getAvailableSeatCount(Type type) {

        int total = 0;

        for (int i = 0; i < cinemaCount; i++) {

            total += cinemas[i].getAvailableSeatCount(type);

        }

        return total;
    }

    private void ensureCapacity(int minCapacity) {

        int oldCap = (cinemas == null) ? 0 : cinemas.length;
        if (oldCap >= minCapacity) return;
        int newCap = Math.max(1, Math.max(minCapacity, oldCap * 2));

        Cinema[] next = new Cinema[newCap];

        for (int i = 0; i < cinemaCount; i++) {
            next[i] = cinemas[i];
        }

        cinemas = next;

    }

    public void simpleDisplay() {
    
        System.out.println("=== CITY: " + cityName + " | All Cinema Layouts ===");
        for (int i = 0; i < cinemaCount; i++) {

        cinemas[i].simpleDisplay();
        System.out.println("=======================================");

        }

        System.out.printf("City Totals -> Seats: %d, Available: %d%n", getTotalSeatCount(), getAvailableSeatCount());
        System.out.println();

    }

    public void verboseDisplay() {

    System.out.println("=== CITY: " + cityName + " | Detailed Seats ===");

    for (int i = 0; i < cinemaCount; i++) {

        cinemas[i].verboseDisplay();
        System.out.println("=======================================");

    }

    System.out.printf("City Totals -> Seats: %d, Available: %d%n", getTotalSeatCount(), getAvailableSeatCount());
    System.out.println();

    }
    


    @Override
    public String toString() {
        
        return String.format("CityCinema [city='%s', cinemas=%d, totalSeats=%d, available=%d]", getCityName(), getCinemaCount(), getTotalSeatCount(), getAvailableSeatCount());

    }

}
