import java.util.Random;

public class Rectangle{

	protected double height;
	protected double width;
	double max = 10;
	double min = 1;
	
	Rectangle(double height, double width){

		this.height = height;
		this.width = width;

	}
	
	Rectangle(){
	
		this.height = (Math.random() * (max - min)) + min; 
		this.width = (Math.random() * (max - min)) + min;

	}

	public double calculateArea(){

		return height*width;
		

	}

	@Override 
	public String toString(){

		return String.format(" Height: %.2f | Width: %.2f", height, width);

	}




}

