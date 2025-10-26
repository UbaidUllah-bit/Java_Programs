package sp25_bcs_134;

public enum PlotType{

	RES_5_MARLA("Residential 5 Marla", 4_000_000), RES_10_MARLA("Residential 10 Marla", 7_500_000), RES_1_KANAL("Residential 1 Kanal", 14_000_000), COMM_SHOP("Commercial Shop", 3_000_000), COMM_OFFICE("Commercial Office", 5_000_000), PARKING("Parking", 200_000);

	private String name;
	private double price;

	PlotType(String name, double price){

		this.name = name;
		this.price = price;
	
	}

	public double getPrice(){

		return price;

	}
	
	public String getName(){

		return name;

	}

	public void setPrice(double price){

		this.price = price;

	}

}