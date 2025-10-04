
public class Seat{

    private String id;
    private Type type;
    private boolean isAvailable;
    private int price;
        
    Seat(int row, int column, Type type){
    
        id = String.format("%d-%03d", row, column);
        this.type = type;
        isAvailable = true;
        this.price = type.getPrice();
        
    }

    public String bookSeat(){

        if(isAvailable){

            isAvailable = false;

            return "Seat is available";            
    
        }

        else{

            return "not available";

        }


    }

    public String cancelBooking(){

        if(!isAvailable){

            isAvailable = true;

            return "Seat has been cancelled";            
    
        }

        else{

            return "Seat not booked yet";

        }


    }

    public void setSeatType(Type type){

        this.type = type;

    }

    public void setPrice(){

        this.price = price;

    }

    public String getId(){

        return id;

    }
    
    public Type getSeatType(){

        return type;

    }

    public boolean getAvailability(){

        return isAvailable;

    }

    public int getPrice(){

        return price;

    }
    
    @Override    
    public String toString(){

        return String.format("[%s]-%s-%d: %b", id, type, type.getPrice(), isAvailable);


    }










}
