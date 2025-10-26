public class Parcel{

	protected String ID;
	protected ParcelType parcel;
	protected ParcelStatus status;
	
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

	@Override
	public String toString(){

		return String.format("- %s | %s | %s", this.ID, this.parcel, this.status);

	}

}