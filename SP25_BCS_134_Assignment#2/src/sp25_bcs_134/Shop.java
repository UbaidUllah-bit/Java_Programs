package sp25_bcs_134;

public class Shop{

    private final String id;
    private final double listPrice;
    private boolean vacant; 

    Shop(String id){

        this.id = id;
        this.listPrice = PlotType.COMM_SHOP.getBasePrice(); 
        this.vacant = true; 

    }

    public boolean book(){

        if (vacant){

            vacant = false;
            return true;

        }

        return false;
    }

    public boolean isVacant(){

        return vacant;
    }
    

    public String getId(){ 

	return id;

	}
    
    @Override
    public String toString(){

        String status = vacant ? "Vacant" : "Rented";
        return String.format("Shop %s | Price: %.0f PKR | Status: %s", id, listPrice, status);

    }

}
