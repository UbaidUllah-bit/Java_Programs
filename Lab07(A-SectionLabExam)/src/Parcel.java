public class Parcel{

	private String ID;
	private ParcelType parcel;
	private ParcelStatus status;
	
	Parcel(int ID, ParcelType parcel){

		this.ID = String.format("PKX-2025-%06d" , ID);
		this.parcel = parcel;
		this.status = ParcelStatus.IN_STORAGE;

	}

	public void changeStatus(ParcelStatus status){

		if(this.status == status){

			System.out.printf("Cannot change status, status is already %s", this.status);			

		}
		
		else{

			this.status = status;

		}
		

	}

	public String getId(){

		return ID;

	} 

	public ParcelType getParcelType(){

		return parcel;

	}

	public ParcelStatus getParcelStatus(){

		return status;
	
	}
	@Override
	public String toString(){

		return String.format("- %s | %s | %s", this.ID, this.parcel, this.status);

	}

}