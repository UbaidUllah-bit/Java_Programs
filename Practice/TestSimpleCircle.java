public class TestSimpleCircle{
	
	public static void main(String[] args){
		
			
			SimpleCircle circle1 = new SimpleCircle();
		
				System.out.println(" The area of a circle with radius " + circle1.radius + " , its area is " + circle1.getArea() + " and its perimeter is " + circle1.getPerimeter());

			SimpleCircle circle2 = new SimpleCircle(25);
				
				System.out.println(" The area of a circle with radius " + circle2.radius + " , its area is " + circle2.getArea() + " and its perimeter is " + circle2.getPerimeter());

				System.out.println(" The area of a circle with radius " + new SimpleCircle(50).radius + " , its area is " +  new SimpleCircle(50).getArea() + " and its perimeter is " +  new SimpleCircle(50).getPerimeter());

			circle2.setRadius(100);
				
				System.out.println(" The area of a circle with radius " + circle2.radius + " , its area is " + circle2.getArea() + " and its perimeter is " + circle2.getPerimeter());
		


			








}




}