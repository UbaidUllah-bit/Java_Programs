public class Address{

	private String street;
	private String city;
	private String country;

	Address(String street, String city, String country){

		this.street = street;
		this.city = city;
		this.country = country;


}
	Address(Address a){

		this.street = a.getStreet();
		this.city = a.getCity();
		this.country = a.getCountry();

}

	public String getStreet(){

		return street;
}

	public String getCity(){

		return city;
}

	public String getCountry(){

		return country;
}

	@Override
	public boolean equals(Object o){

	Address A = (Address) o;

	return (this.street.equals(A.street) && this.city.equals(A.city) && this.country.equals(A.country));


}

	@Override
	public String toString(){

		return String.format("%s\t%s\t%s", street, city, country);

}


}