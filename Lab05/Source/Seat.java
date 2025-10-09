
public class Seat{

    private String id;
    private Type type;
    private boolean isAvailable;
    private int price;
    private int availabilityCount = 0;
        
    Seat(int row, int column, Type type){
    
        id = String.format("%d-%03d", row, column);
        this.type = type;
        isAvailable = true;
    
        if(isAvailable == true){

            availabilityCount++;
        }
        
        this.price = type.getPrice();
        
    }

    public boolean bookSeat(){

        if(isAvailable){

            isAvailable = false;
            availabilityCount--;

            return true;            
    
        }

        else{

            return false;

        }


    }

    public boolean cancelBooking(){

        if(!isAvailable){

            isAvailable = true;
            availabilityCount++;
            return true;            
    
        }

        else{

            return false;

        }


    }

    public void setSeatType(Type type){

        this.type = type;

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

    public int getAvailabilityCount(){

        return availabilityCount;        

    }
    
    @Override    
    public String toString(){

        return String.format("[%s]-%s-%d: %b", id, type, type.getPrice(), isAvailable);


    }










}
