public class Demo{

	public static void main(String[] args){


		/*Parcel P1 = new Parcel(111, ParcelType.Regular);
		System.out.println(P1);

		FragileParcel F1 = new FragileParcel(222);
		System.out.println(F1);*/

		//Slot s1 = new Slot(2,10);

		//System.out.println(s1);

		//s1.addParcel(111, ParcelType.Regular);
		//System.out.println(s1.getSlotById("R2-S10"));

		
		/*System.out.println(s1.getId());
		/*System.out.println(s1.getParcel());
		System.out.println(s1.getSlotType());		
		System.out.println(s1);*/



		//System.out.println(r1);

		/*Depot d1 = new Depot("LahoreDepot", 4);
		
		System.out.println(d1);


		d1.addRack(new Rack(3,new int[] {3,4,3}));
		System.out.println(d1);*/

		Depot lahore = new Depot("Lahore Depot", 1); 
		System.out.println(lahore);

		Rack rack1 = new Rack(1, new int[]{3, 4, 3}); 
		lahore.addRack(rack1);
		
		System.out.println(lahore);
		lahore.displayLayout();
		Parcel P1 = new Parcel(111, ParcelType.Regular);
		FragileParcel P2 = new FragileParcel(222);
		lahore.store(1,2,0,222,P2);
		lahore.store(1,1,0,111,P1);
		lahore.displayLayout();
		lahore.remove("LR-1", "R2-S02");
		lahore.displayLayout();
		System.out.println("First available slot: " + lahore.findFirstAvailable());
		System.out.println("Total Capacity: " + lahore.getTotalCapacity());
		
		Parcel p[] = rack1.getParcelsByType(ParcelType.Regular);

		for(Parcel parcel : p){

			System.out.println(parcel + "\n");

		}
		





	}


}