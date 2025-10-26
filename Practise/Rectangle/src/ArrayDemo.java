public class ArrayDemo{

	public static void main(String[] args){

		Ad2Rectangle row[][] = new Ad2Rectangle[10][];
		initialize2dArray(row);
		
		for(Ad2Rectangle[] r : row){
		
			for(Ad2Rectangle k : r){
			
			System.out.println(k);

			}

		}
	
		//array intersection check
		Ad2Rectangle r1 = row[0][1].isIntersecting(row[1][1]);
		System.out.println(r1);
		

	}

	private static void initializeArray(Ad2Rectangle[] row){

		for(int i = 0; i < row.length; i++){

			row[i] = new Ad2Rectangle();

		}

	}

	private static void initialize2dArray(Ad2Rectangle[][] row){


		for(int i = 0; i < row.length; i++){

			row[i] = new Ad2Rectangle[5];
			initializeArray(row[i]);
			
		}

	}



}