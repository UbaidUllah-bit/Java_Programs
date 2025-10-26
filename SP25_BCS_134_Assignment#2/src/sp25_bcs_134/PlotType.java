package sp25_bcs_134;

public enum PlotType{
    
    RES_5_MARLA(4000000.0, "Residential 5 Marla", ShapeType.RECTANGLE),
    RES_10_MARLA(7500000.0, "Residential 10 Marla", ShapeType.RECTANGLE),
    RES_1_KANAL(14000000.0, "Residential 1 Kanal", ShapeType.TRAPEZOID),
    COMM_SHOP(3000000.0, "Commercial Shop", ShapeType.RECTANGLE),
    COMM_OFFICE(5000000.0, "Commercial Office", ShapeType.RECTANGLE),
    PARKING(200000.0, "Parking", ShapeType.RECTANGLE); 

    private final double basePrice;
    private final String name;
    private final ShapeType defaultShape;

    PlotType(double basePrice, String name, ShapeType defaultShape){
        this.basePrice = basePrice;
        this.name = name;
        this.defaultShape = defaultShape;
    }

    public double getBasePrice(){ 

	return basePrice; 

	}

    public String getName(){ 

	return name;

	 }

    public ShapeType getDefaultShape(){ 

	return defaultShape;

	 }
}