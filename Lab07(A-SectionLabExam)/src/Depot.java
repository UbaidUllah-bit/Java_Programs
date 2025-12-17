public class Depot{

	private String name;
	private int rackLength;
	private Rack[] racks;
	private int count;
	private int totalCount;
	

	Depot(String name, int rackLength){

		this.name = name;
		this.rackLength = rackLength;

		racks = new Rack[rackLength];

		
		/*for(int i = 0; i < racks.length; i++){

				racks[i] = new Rack(i+1, new int[] {i+1, i+2, i+3});
		
		}*/

	}
	
	public Parcel remove(String rackId, String Id){

		for(int i = 0; i < racks.length; i++){

			if(racks[i].getRackId().equals(rackId)){

				Parcel p = racks[i].removeParcel(Id);

				if(p == null){
			
					return p;
				
				}

			}

			
		}
	
		return null;




	}

	public void displayLayout(){

		for(int i = 0; i < racks.length; i++){

			System.out.println(name);
			System.out.println(racks[i] + "\n");


		}

	}

	public int getTotalCapacity(){

		for(int i = 0; i < racks.length; i ++){


			if(racks[i] != null){

				totalCount = totalCount + racks[i].getTotalCapacity();
				
			}

		}
	
		return totalCount;


	}


	public String findFirstAvailable(){


		for(int i = 0; i < racks.length; i++){

			if(racks[i] != null && racks[i].getRackId() != null){

				String availableSlot = racks[i].findFirstAvailable();

				if(availableSlot != null){


					return availableSlot;

				}

			}
		}
			
			
		return "Cannot find an empty slot!";

			
	}

	public void store(int row, int column, int rackId, int parcelId, Parcel p){

		//String Id = String.format("R%d-S%02d", row, column);

		racks[rackId].addParcel(row, column, parcelId, p.getParcelType());

	}
	
	public void addRack(Rack rack){

		if(count < racks.length){ racks[count++] = rack;}

		else { System.out.println("No more space left! Increase the Depot's racks size."); }	

	}


	//public void addParcel(String rackId,)


	@Override
	public String toString(){

		StringBuilder str = new StringBuilder();
		str.append(name + "\n");
		for(int i = 0; i < racks.length; i++){

			str.append(racks[i] + "\n");

			}

		return str.toString();

	}


}	