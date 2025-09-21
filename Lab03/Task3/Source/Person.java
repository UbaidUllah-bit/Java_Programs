
public class Person{

	private String name;
	private Gender gender;
	private Address address;

	Person(){

	this(null, Gender.Default, new Address(null, null, null));
	
}

	Person(String name, Gender gender, Address address){

	this.name = name;
	this.gender = gender;
	this.address = address;
}

	Person(Person p){

	this.name = p.getName();
	this.gender = p.getGender();
	this.address = new Address(p.getAddress());

}

	public void setName(String name){

	this.name = name;
}

	public void setGender(Gender gender){

	this.gender = gender;
}

	public void setAddress(Address address){

	this.address = address;
}

	public String getName(){

	return name;
}

	public Gender getGender(){

	return gender;
}

	public Address getAddress(){

	return address;
}

	@Override
	public String toString(){

	return String.format("%n^-^ Author's Space ^-^%n%nName: %s %nGender: %s %nAddress: %s", name, gender, address);

}

	@Override
	public boolean equals(Object o){

	Person temp = (Person) o;

	return (this.name.equals(temp.getName()) && this.gender.equals(temp.getGender()) && this.address.equals(temp.getAddress()));


}

	

}