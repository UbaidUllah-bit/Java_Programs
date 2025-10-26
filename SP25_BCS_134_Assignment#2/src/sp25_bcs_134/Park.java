package sp25_bcs_134;

public class Park{

    private final String name;
    private final ShapeType shape;
    private final double area;
    
    private final double w1, d1, w2, d2, front, back;

    Park(String name, ShapeType shape, double w1, double d1, double w2, double d2, double front, double back){

        this.name = name;
        this.shape = shape;
        this.w1 = w1; 
	this.d1 = d1; 
	this.w2 = w2; 
	this.d2 = d2;
        this.front = front; 
	this.back = back;
        this.area = calculateArea();

    }
    
    private double calculateArea(){

        switch (shape){
	
            case RECTANGLE:
                return w1 * d1; 
            case TRAPEZOID:
                return ((front + back) / 2.0) * d1; 
            case L_SHAPE:
                return (w1 * d1) + (w2 * d2); 
            default:
                return 0.0;
        }

    }

    public String getName(){ 

	return name;

	 }

    public double getArea(){ 

	return area; 

	}

    @Override
    public String toString() {

        return String.format("%s (%s) | Area: %.1f su", name, shape.name(), area);

    }

}
