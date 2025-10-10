package sp25_bcs_134;

public class Cinema{

    private String cinemaName;
    private int numberOfScreens;
    Screen screens[];
    
    Cinema(String cinemaName, int numberOfScreens){

        this.numberOfScreens = numberOfScreens;

        screens = new Screen[numberOfScreens];
        for(int i = 0; i < screens.length; i++){
    
            screens[i] = new Screen("Screen-"+ (i+1));


        }
        this.cinemaName = cinemaName;

    }

    Cinema(String cinemaName){
		
  		this(cinemaName,0);

	}

    public int getTotalSeatCount() {

		int total = 0;
		for (Screen s : screens){

            total += s.getTotalSeats();

        }

		return total;
	}

	public int getAvailableSeatCount() {

		int total = 0;
		for (Screen s : screens){

            total += s.AvailableSeatCount();

        }
		return total;
	}

	public int getAvailableSeatCount(Type type) {

		int total = 0;
		for (Screen s : screens){

            total += s.AvailableSeatByTypeCount(type);

        }
		return total;
	}


    private int getNumberOfScreens(){

        return numberOfScreens;

    }

    public String getCinemaName(){

        return cinemaName;

    }

    public int getScreenCount(){

        return getNumberOfScreens();

    }

    public Screen getScreen(int index) {

		checkIndex(index);

		return screens[index];

	}

    public Screen getScreenByName(String screenName) {

		for (Screen s : screens) {
			
            if(screenName.equalsIgnoreCase(s.getScreenName())){
        
                return s;
            }
    
		}
		
        return null;
	}

    public void addScreen(Screen screen) {
    
            if(screen == null) {
        
                System.out.println("Cannot add screen: screen must not be null.");
                
                return;
            }

            if(getScreenByName(screen.getScreenName()) != null) {

                System.out.println("Screen with name '" + screen.getScreenName() + "' already exists.");

                return;

            }

            Screen[] newScreens = new Screen[numberOfScreens + 1];
            // Copy the old screens to the new array
            for (int i = 0; i < numberOfScreens; i++) {
                newScreens[i] = screens[i];
            }
            // Add the new screen
            newScreens[numberOfScreens] = screen;
            // Update the array reference and screen count
            screens = newScreens;
            numberOfScreens++;

            System.out.println("Screen '" + screen.getScreenName() + "' added successfully.");
}


    public Screen addScreen(String screenName) {

		Screen s = new Screen(screenName);

		addScreen(s);

		return s;

	}

    public boolean book(int screenIndex, String seatId) {

		Screen s = getScreen(screenIndex);
		return s.bookSeatById(seatId);

	}

	public boolean book(String screenName, String seatId) {

		Screen s = requireScreen(screenName);
		return s.bookSeatById(seatId);
	}

	public boolean cancel(int screenIndex, String seatId) {

		Screen s = getScreen(screenIndex);
		return s.cancelSeatById(seatId);
	}

	public boolean cancel(String screenName, String seatId) {

		Screen s = requireScreen(screenName);
		return s.cancelSeatById(seatId);
	}


    

    private void checkIndex(int index) {

		if (index < 0 || index >= screens.length) {

			System.out.println("Screen index out of range: " + index);

		}

        return;

	}

    private Screen requireScreen(String screenName) {

		Screen s = getScreenByName(screenName);
   
		if (s == null) {

			System.out.println("No screen named '" + screenName + "' in cinema '" + cinemaName + "'.");
            return null;

		}
		return s;
	}


    public void verboseDisplay(){

     System.out.printf("\n--Total Screens in %s--", cinemaName);


        for(Screen s: screens){
    
            
        System.out.println("\n==========================="); 

            System.out.println("\t" + s.getScreenName());
            System.out.println("\n===========================");
            s.verboseDisplay();

        }           

    }

    public void simpleDisplay() {

		System.out.println("=== CINEMA: " + cinemaName + " | Layouts ===");

		for (Screen s : screens){
			s.simpleDisplay();
			System.out.println("---------------------------");
		}
		System.out.printf("Cinema Totals -> Seats: %d, Available: %d%n", getTotalSeatCount(), getAvailableSeatCount());

		System.out.println();
	}


    @Override
    public String toString(){

        return String.format("Cinema{name='%s', screens=%d, totalSeats=%d, available=%d}", cinemaName, getScreenCount(), getTotalSeatCount(),getAvailableSeatCount());
	

  
    }

}
