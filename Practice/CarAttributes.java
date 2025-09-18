public class CarAttributes{
	public static void main(String[] args){
		Car car1 = new Car();	// object of class
		car1.color = "Red";
		car1.speed = 120;

		System.out.println(car1.color + " car speed: " + car1.speed);
		car1.drive();
}
}