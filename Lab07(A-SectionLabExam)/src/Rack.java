public class Rack{

	private Slot[][] slots;
	private int[] rowLength;
	private int totalCount;
	
	
	private String rackId;

	int row;
	int column;

	Rack(int Id, int[] rowLength){

		this.rackId = String.format("LR-%d", Id);

		slots = new Slot[rowLength.length][];

		for(int i = 0; i < slots.length; i++){

			slots[i] = new Slot[rowLength[i]];

		}

		for(int i = 0; i < slots.length; i++){

			for(int j = 0; j < slots[i].length; j++){

				slots[i][j] = new Slot(i + 1, j + 1);

			}


		}


	}

	public int getTotalCapacity(){

		for(int i = 0; i < slots.length; i++){

			for(int j = 0; j < slots[i].length; j++){
	
				totalCount++;
				
			}

		}

		return totalCount;

	}

	public String getRackId(){

		return rackId;

	}

	public void addParcel(int row, int column, int Id, ParcelType type){

		if(slots[row][column].toString().equals("[--]")){

			slots[row][column].addParcel(Id, type);
			System.out.println(" Parcel " + slots[row][column].getId() + " added successfully! ");
		}

		else{

			System.out.println("Slot is already in use!" );

		}

	

	}

	public Parcel removeParcel(String Id){

		for(int i = 0; i < slots.length; i++){

			for(int j = 0; j < slots[i].length; j++){

				if(slots[i][j].getId().equals(Id)){

					Parcel p = slots[i][j].removeParcel();

					if(p == null){
			
					return p;
				
					}


				}

			}

		}

		return null;

	}

	public String findFirstAvailable(){

		for(int i = 0; i < slots.length; i++){

			for(int j = 0; j < slots[i].length; j++){

				if(slots[i][j].toString().equals("[--]")){

					return String.format("Available Slot found at %s" , slots[i][j].getId());
				}


			}

		}

		return null;

	}

	public Parcel[] getParcelsByType(ParcelType type){

		int count = 0;
		for(int i = 0; i < slots.length; i++){

			for(int j = 0 ; j < slots[i].length; j++){

				if(slots[i][j].getSlotType() == type){

					count++;

				}


			}

		}

		Parcel availableParcel[] = new Parcel[count];
		int index = 0;
		for(int i = 0; i < slots.length; i++){

			for(int j = 0 ; j < slots[i].length; j++){

				if(slots[i][j].getSlotType() == type){

					availableParcel[index] = slots[i][j].getParcel();
					index ++;

				}


			}

		}

		return availableParcel;


	}

	@Override
	public String toString(){

		StringBuilder str = new StringBuilder();

		str.append(rackId + "\n");
		for(int i = 0; i < slots.length; i++){

			str.append("R" +(i+1)+": ");
			for(int j = 0; j < slots[i].length; j++){

				str.append(slots[i][j] + " ");

			}
			
			str.append("\n");

			}

		return str.toString();

		}

}