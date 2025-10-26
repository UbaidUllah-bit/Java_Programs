public class Demo{

	public static void main(String[] args){

		int count = 0;


		//new Ad2Rectangle(TLC, TRC, BRC, BLC);
		Ad2Rectangle r2 = new Ad2Rectangle("Blue", new Point(2,7),new Point(8,7),new Point(8,3),new Point(2,3));
		System.out.println("Rectangle 1:");
		System.out.println(r2);
		System.out.println();
		
		//Co-ordinates for falsifying intersection for one rectangle
		//Ad2Rectangle r3 = new Ad2Rectangle(new Point(9,5),new Point(9,11),new Point(5,11),new Point(5,5));
		
		Ad2Rectangle r3 = new Ad2Rectangle("Yellow", new Point(5,9),new Point(11,9),new Point(11,5),new Point(5,5));
		System.out.println("Rectangle 2:");
		System.out.println(r3);

		Ad2Rectangle r4 = r2.isIntersecting(r3);

		System.out.println("\n*Intersecting both rectangles with given co-ordinates*");
		System.out.println("Co-ordinates of rectangle formed from intersection:");
		System.out.println((r4 == null) ? "Following co-ordinates do'nt form a rectangle" : r4);
		System.out.printf("Area of rectangle: %.2f (unit)",r4.calculateArea());
		
		


	}



}