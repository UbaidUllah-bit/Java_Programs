public class FragileParcel extends Parcel{

	private boolean insuranceFlag;

	FragileParcel(int ID){

		super(ID, ParcelType.Fragile);
		this.insuranceFlag = true;
		
	}
	
	public boolean getInsurance(){

		return insuranceFlag;

	}
	
	public void setInsurance(boolean insuranceFlag){

		this.insuranceFlag = insuranceFlag;

	}

	@Override
	public String toString(){

		return String.format("Fragility: %b, %s ", insuranceFlag, super.toString());

	}

	

	



}