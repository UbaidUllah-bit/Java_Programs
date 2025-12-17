public class Bin{

	private int row1;
	private int bin1;
	private Part part;

	Bin(int row1, int bin1, Part part){

		this.row1 = row1;
		this.bin1 = bin1;
		this.part = part;


	}

	public int getRow(){

		return row1;

	}

	public int getBin(){

		return bin1;	

	}

	public Part getPart(){

		return part;	

	}
	
	public boolean store(Part part){

		if(this.part == null){

			return true;

		}

		return false;

	}

	public Part addPart(Part part){

		if(this.part != null){

			this.part = part;
			return part;

		}

		return part;


	}
	
	public Part remove(Part part){

		this.part = null;

		return this.part;		

	}

	@Override
	public String toString(){

		if(this.part instanceof Part){ return "[R]"; }

		else if(this.part instanceof CriticalPart){ return "[C]";}
	
		else { return "[--]";}

	}



}