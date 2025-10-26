import java.lang.Math;

public class Ad2Rectangle extends Adrectangle{

	Point topLeftCorner;
	Point topRightCorner;
	Point bottomRightCorner;
	Point bottomLeftCorner;

	Ad2Rectangle(String fillColor, Point TLC, Point TRC, Point BRC, Point BLC){

		super(calculateHeight(TLC, TRC), calculateWidth(TLC, BLC), fillColor);

		topLeftCorner = TLC;
		topRightCorner = TRC;
		bottomRightCorner = BRC;
		bottomLeftCorner = BLC;

	}

	Ad2Rectangle(){

		super();

		topLeftCorner = new Point(2,5);
		topRightCorner = new Point(5,5);
		bottomRightCorner = new Point(5,3);
		bottomLeftCorner = new Point(2,3);

	}

	public Ad2Rectangle isIntersecting(Ad2Rectangle other){

		//vice versa for LeftEdge
		//int intersectionLeftEdge = Math.max(this.bottomLeftCorner.x, other.bottomLeftCorner.x);
		int intersectionLeftEdge = Math.max(this.topLeftCorner.x, other.topLeftCorner.x);
		
		//vice versa for RightEdge
		//int intersectionRightEdge = Math.min(this.bottomRightCorner.x, other.bottomRightCorner.x);
		int intersectionRightEdge = Math.min(this.topRightCorner.x, other.topRightCorner.x);
		
		//vice versa for TopEdge
		//int intersectionTopEdge = Math.min(this.topRightcorner.y, other.topRightCorner.y);
		int intersectionTopEdge = Math.min(this.topLeftCorner.y, other.topLeftCorner.y);

		//vice versa for BottomEdge
		//int intersectionBottomEdge = Math.max(this.bottomLeftCorner.y, other.bottomLeftCorner.y);
		int intersectionBottomEdge = Math.max(this.bottomRightCorner.y, other.bottomRightCorner.y);
		
		if (intersectionLeftEdge >= intersectionRightEdge || intersectionBottomEdge >= intersectionTopEdge) {
        		
			return null;
		} 
		
		Point newTopLeft = new Point(intersectionLeftEdge, intersectionTopEdge);
    		Point newTopRight = new Point(intersectionRightEdge, intersectionTopEdge);
    		Point newBottomLeft = new Point(intersectionLeftEdge, intersectionBottomEdge);
    		Point newBottomRight = new Point(intersectionRightEdge, intersectionBottomEdge);
	
		return new Ad2Rectangle("Green", newTopLeft, newTopRight, newBottomRight, newBottomLeft);
	

		

	}
	
	private static double calculateHeight(Point TLC, Point TRC){
	
		return Math.sqrt(((TRC.x - TLC.x)*(TRC.x - TLC.x)) + ((TRC.y - TLC.y)*(TRC.y - TLC.y)));

	}

	private static double calculateWidth(Point TLC, Point BLC){

		return Math.sqrt(((TLC.x - BLC.x)*(TLC.x - BLC.x)) + ((TLC.y - BLC.y)*(TLC.y - BLC.y)));

	}

	

	@Override
	public String toString(){

		return String.format("%sCo-ordinate-1: %s | Co-ordinate-2: %s | Co-ordinate-3: %s | Co-ordinate-4: %s", super.toString(), topLeftCorner.toString(), topRightCorner.toString(), bottomRightCorner.toString(), bottomLeftCorner.toString());

	}


}
class Point{

	int x;
	int y;
	
	Point(int x, int y){

		this.x = x;
		this.y = y;

	}

	@Override
	public String toString(){

		return String.format("(%d, %d)", x, y);
	}


}