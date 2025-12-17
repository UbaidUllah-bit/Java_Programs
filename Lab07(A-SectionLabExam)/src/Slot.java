public class Slot{

	private String ID;
	Parcel parcel;
	int row;
	int column;

	Slot(int row, int column){

		this.ID = String.format("R%d-S%02d", row, column);

	}

	public Parcel removeParcel(){

		this.parcel = null;
		return parcel;

	}

	public void addParcel(int ID, ParcelType type){

		if(type == ParcelType.Fragile){

			this.parcel = new FragileParcel(ID);

		}
		
		else{

			this.parcel = new Parcel(ID, type);

		}


	}

	public String getSlotById(String ID){

		if(this.ID == ID){

			return ID;

		}
		
		else{

			return String.format("Slot ID: %s not found", ID);

		}
	}

	public ParcelType getSlotType(){

		if(this.parcel != null){

			return this.parcel.getParcelType();	
	
		}

		else{

			return null;
		
		}

	}

	public String getId(){

		return ID;

	}

	public Parcel getParcel(){

		return parcel;

	}

	public String toString(){

		if(this.parcel instanceof FragileParcel){

			return "[F]";

		}
	
		else if(this.parcel instanceof Parcel){

			return "[R]";

		}

		else{

			return "[--]";

		}


	}

}