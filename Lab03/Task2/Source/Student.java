
public class Student{

	private String studentId; //instance variables
	private String name;
	private Gender gender;
	private Date dateOfBirth;
	private Address address;
	static int counter = 0;

	Student(){

	this(null, Gender.Male, new Date(1,1,2000), new Address(null, null, null)); //constructor chaining
	

	//alternative
	/* studentId = String.format("SP25-BCS-%03d", ++counter);
	name = null;
	this.gender = Gender.Male;
	dateOfBirth = new Date(1,1,2000);
	address = new Address(null, null, null); */
	



}

	//parameterized constructor

	Student( String name, Gender gender, Date dateOfBirth, Address address){

	studentId = String.format("SP25-BCS-%03d", ++counter);
	this.name = name;
	this.gender = gender;
	this.dateOfBirth = dateOfBirth;
	this.address = address;


}

	//copy constructor

	Student( Student s){

	this.studentId = String.format("SP25-BCS-%03d", ++counter);
	this.name = s.getName();
	this.gender = s.getGender();
	this.dateOfBirth = new Date(s.getDateOfBirth());
	this.address = new Address(s.getAddress());

}

	public void setName( String name){

	this.name = name;
	

}


	public void setGender( Gender gender){

	this.gender = gender;
	

}

	public void setDateOfBirth( Date dateOfBirth){

	this.dateOfBirth = dateOfBirth;
	

}

	public void setAddress( Address address){

	this.address = address;
	

}

	public String getStudentId(){

	return studentId;


}

	public String getName(){

	return name;


}

	public Gender getGender(){

	return gender;


}

	public Date getDateOfBirth(){

	return dateOfBirth;


}

	public Address getAddress(){

	return address;


}
	// comparing names

	@Override
	public boolean equals(Object o){

		Student temp = (Student) o;
		return this.name.equals(temp.name);

}
	@Override
	public String toString(){

		return String.format(" [ Student Id: %s Name: %s Gender: %s DOB: %s Address: %s ]",studentId, name, gender, dateOfBirth, address );
}


	




	
	

	
		



}