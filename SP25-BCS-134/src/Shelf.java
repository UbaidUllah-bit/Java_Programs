public class Shelf{

	private Bin[][] row;
	private int capacity;
	private int occupied;
	private String shelfId;
	protected int size;
	private int count;

	Shelf(int Id, int[] rowlength){

		this.shelfId = String.format("S%d", Id);
		row = new Bin[rowlength.length][];

		for(int i = 0; i < rowlength.length; i++){

			row[i] = new Bin[rowlength[i]];

		}
		
		for(int i = 0; i < rowlength.length; i++){

			for(int j = 0; j < rowlength[i]; j++){

				row[i][j] = new Bin(rowlength.length, rowlength[i], null);

			}

		}

	
	}

	/*public Part store(String shelfId, Part p){

		if()

		



	}*/


	@Override
	public String toString(){

		StringBuilder str = new StringBuilder();
		
		str.append(shelfId + "\n");

		for(int i = 0; i < row.length; i++){

			str.append("R" + (i+1) + ":");
			for(int j = 0; j < row[i].length; j++){

				str.append(row[i][j] + " ");

			}
		
			str.append("\n");

		}

		return str.toString();
		

	}






}