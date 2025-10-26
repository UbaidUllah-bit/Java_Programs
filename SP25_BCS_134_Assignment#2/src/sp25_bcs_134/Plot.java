package sp25_bcs_134;

public class Plot {

    private final String id;
    private final PlotType type;
    private final ShapeType shape;
    private boolean available; 
    
    // Dimensions 
    private final double width, depth, front, back; 
    private final double w1, d1, w2, d2;           

    private final double area;  
    private final double listPrice; 

    Plot(String id, PlotType type, ShapeType shape, double w1, double d1, double w2, double d2, double front, double back){

        this.id = id;
        this.type = type;
        this.shape = shape;
        
        this.width = w1;    
        this.depth = d1;    
        this.front = front;
        this.back = back;
        this.w1 = w1;
        this.d1 = d1;
        this.w2 = w2;
        this.d2 = d2;

        this.area = calculateArea(); 

        this.listPrice = type.getBasePrice(); 
        this.available = true;      

    }
    
    private double calculateArea(){
        
        switch (shape){

            case RECTANGLE:
                return width * depth; 
            case TRAPEZOID:
                return ((front + back) / 2.0) * depth; 
            case L_SHAPE:
                return (w1 * d1) + (w2 * d2); 
            default:
                return 0.0;
        }

    }

    public boolean book(){
        if (available){

            available = false;
            return true;
        }
        return false;
    }

    public boolean cancel() {
        if (!available) {
            available = true;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){

        String status = available ? "Available" : "Booked";
        return String.format("%s (%s) | Area: %.1f su | Price: %.0f PKR | Status: %s", id, type.getName(), area, listPrice, status);

    }
    
    public String getId(){ 

	return id;

	 }

    public PlotType getType(){ 

	return type;
	
	 }

    public boolean isAvailable(){ 

	return available; 

	}

    public double getArea(){ 

	return area; 

	}

    public double getListPrice(){ 

	return listPrice; 

	}

    public double getBasePrice(){ 

	return type.getBasePrice(); 

	}

    public boolean isCornerPlot(){ 

	return false; 

	} 
    
    public String getCompactStatus(){

        return available ? "[A]" : "[X]";

    }

}
