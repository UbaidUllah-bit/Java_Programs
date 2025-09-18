public class SimpleCircle{

	double radius;

SimpleCircle(){

	radius = 1;

}

SimpleCircle(double newRadius){

radius = newRadius;

}

public double getArea(){

return radius * radius * Math.PI;

}

public double getPerimeter(){

return 2 * radius * Math.PI;

}

public void setRadius(double newRadius){

radius = newRadius;

}

}