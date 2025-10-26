public class Adrectangle extends Rectangle{

	protected String fillColor;
	
	Adrectangle(double height, double width, String fillColor){

		super(height, width);
		this.fillColor = fillColor;
		
		
	}
	
	Adrectangle(){

		super();
		fillColor = "Magenta";
		

	}

	@Override
	public String toString(){

		return String.format("Dimensions:%s , Color: %s%n", super.toString(), fillColor);

	}

}