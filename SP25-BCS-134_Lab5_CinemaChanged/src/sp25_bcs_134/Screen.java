package sp25_bcs_134;

public class Screen{

    private String screenName;

    //made changes in line 7
    private final Seat seats[][] = new Seat[8][];

    /*Screen(String screenName){

        this();
        

    }*/

    Screen(String screenName){

        this.screenName = screenName;
        //initializing columns
        for(int i = 0; i < seats.length; i++){

            seats[i] = new Seat[10 + i];

        }   

        //initializing objects
        for(int i = 0; i < seats.length; i++){

            for(int j = 0; j < seats[i].length; j++){

                //conditions for distinction in seats                
                if(i < 2){
                    
                    seats[i][j] = new Seat(i, j, Type.Regular);
                }

                else if(i >= 2 && i <= 3){

                    seats[i][j] = new Seat(i, j, Type.Premium);

                }
                
                else if(i >= 4 && i <= 5){
                
                    seats[i][j] = new Seat(i, j, Type.Vip);

                }
                
                else{
        
                    seats[i][j] = new Seat(i, j, Type.Recliner);    

                }
                    

            }

        }


    }

    public int getTotalRegularSeats(){

        int total = 0;

        for(int i = 0; i < 2; i++){
    
            for(Seat s: seats[i]){

                total++;

            }

        }

    return total;


    }

    public int getTotalPremiumSeats(){

        int total = 0;

        for(int i = 2; i < 4; i++){
    
            for(Seat s: seats[i]){

                total++;

            }

        }

    return total;


    }

    public int getTotalVipSeats(){

        int total = 0;

        for(int i = 4; i < 6; i++){
    
            for(Seat s: seats[i]){

                total++;

            }

        }

    return total;


    }

    public int getTotalReclinerSeats(){

        int total = 0;

        for(int i = 6; i < 8; i++){
    
            for(Seat s: seats[i]){

                total++;

            }

        }

    return total;


    }

     public int getTotalSeats(){

        int total = 0;
        
        for(Seat[] seat: seats){

            total += seat.length;

        }
        
        return total;        

    }

    public String getScreenName(){

        return screenName;

    }

    public void verboseDisplay(){

        for(Seat[] s: seats){

            System.out.println("\n");

            for(Seat a: s){

                System.out.println(a);

            }

        }
    
    }

    public void simpleDisplay(){

        System.out.println("=== " + screenName + " | Layout ===");

        for(int i = 0; i < seats.length; i++){

            StringBuilder str = new StringBuilder();

            for(int j = 0; j < seats[i].length; j++){

                Seat s = seats[i][j];
                char mark = (s.getAvailability() ? 'A' : 'X');
                str.append(String.format("[%s:%c] ", s.getId(), mark)); 
                
            }
            
            System.out.println(str.toString());
        }

        System.out.printf("Total Seats: %d, Available Seats: %d%n%n", getTotalSeats(), AvailableSeatCount());

    }

    public Seat getSeat(int row, int column){

        return seats[row][column];

    }

    public Seat getSeatById(String id){

        for(int i = 0; i < seats.length; i++){

            Seat[] row = seats[i];
            
            for(int j = 0; j < row.length; j++){

                Seat s = row[j];

                if (id.equals(s.getId())){
    
                    return s;

                }

            }

        }

        return null;

    }
    
    public boolean bookSeat(int row, int column){

        Seat s = getSeat(row, column);
    
        return s.bookSeat(); //here book seat method is from seat class

    }

    public boolean bookSeatById(String id){

        Seat s = getSeatById(id);

        return s.bookSeat();


    }

    public boolean cancelSeat(int row, int column){

        Seat s = getSeat(row, column);
    
        return s.cancelBooking();

    }

    public boolean cancelSeatById(String id){

        Seat s = getSeatById(id);

        return s.cancelBooking();

    }

    public int AvailableSeatByTypeCount(Type type){

        int count = 0;

        for(Seat[] row : seats){

            for(Seat seat : row){

                if(seat.getSeatType() == type && seat.getAvailability()){

                    count ++;

                }

            }


        }

        return count;

    }

    public int AvailableSeatCount(){

       int count = 0;
        
        for(Seat[] row : seats ){

            for(Seat seat : row){

                if(seat.getAvailability()){

                    count ++;

                }

            }

        }

        return count;        


    }

    public int getRowCount() {

		return seats.length;

	}

	public int getRowLength(int row) {

		checkRow(row);

		return seats[row].length;

	}

    private void checkRow(int row) {

		if (row < 0 || row >= seats.length){
			
            System.out.println("Invalid row: " + row);

            return;

        }

	}

    private void checkBounds(int row, int column) {
		
            checkRow(row);

    		if (column < 0 || column >= seats[row].length){
			System.out.println("Column out of bounds: " + column);

            }
	}

    public Seat findFirstAvailable(Type type) {

		for (int i = 0; i < seats.length; i++) {

			Seat[] row = seats[i];

			for (int j = 0; j < row.length; j++) {

				Seat s = row[j];

				if (s.getSeatType() == type && s.getAvailability()){
                    return s;
                 }
			}
		}
		return null;
	}


    @Override
    public String toString(){

        StringBuilder str = new StringBuilder();
        
        str.append("\n\t\t=========================\n\t\t\t");

        str.append(screenName);
        
        str.append("\n\t\t=========================\n");


            for(Seat[] s: seats){
        
                str.append("\n");
                
                for(Seat a: s){
    
                    str.append("\n\t\t");
                    str.append(a);

                }
            }

        return str.toString();


    }

}
